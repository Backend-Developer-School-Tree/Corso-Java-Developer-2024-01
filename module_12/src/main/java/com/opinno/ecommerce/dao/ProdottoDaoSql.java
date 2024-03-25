package miniEcommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import miniEcommerce.entity.Prodotto;

public class ProdottoDaoSql implements ProdottoDao {
	private String connectionUrl = "jdbc:mysql://localhost:3306/miniecommerce";
	private String username = "root";
	private String password = "";

	@Override
	public Prodotto insert(Prodotto p) {
		Connection conn = null;
		try {
			String sql = "INSERT INTO `prodotto`(`nome`, `descrizione`, `qty`, `prezzo`) VALUES (?,?,?,?)";
			conn = DriverManager.getConnection(connectionUrl, username, password);
			// Il secondo parametro serve per indicare che voglio restituito l'ID generato
			// dal db
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			// rende disponibile l'id generato dal db
			// popolo i parametri
			ps.setString(1, p.getNome());
			ps.setString(2, p.getDescrizione());
			ps.setInt(3, p.getQty());
			ps.setDouble(4, p.getPrezzo());
			// eseguo la query e verifico se è stata eseguuta correttamente
			int row = ps.executeUpdate();
			if (row == 0)
				return null;
			// mi faccio restituire l'ID generato e lo imposto come id del prodotto
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				p.setId(rs.getLong(1));
			}
			return p;
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		} finally { // chiudo la connessione
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Optional<Prodotto> update(Prodotto p) {
		Connection conn = null;
		Prodotto prodottoReturno = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, username, password);
			String sql = "UPDATE `prodotto` SET `nome`=?,`descrizione`=?,`qty`=?,`prezzo`=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getDescrizione());
			ps.setInt(3, p.getQty());
			ps.setDouble(4, p.getPrezzo());
			ps.setLong(5, p.getId());
			// eseguo la query e verifico se è stata eseguuta correttamente
			int row = ps.executeUpdate();
			if (row != 0)
				prodottoReturno = p;
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {// chiudo la connessione
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Optional.ofNullable(prodottoReturno);
	}

	@Override
	public boolean delete(long id) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, username, password);
			String sql = "DELETE FROM `prodotto` WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			// eseguo la query e verifico se è stata eseguuta correttamente
			int row = ps.executeUpdate();
			if (row == 0)
				return false;
			return true;
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {// chiudo la connessione
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Optional<Prodotto> get(long id) {
		Connection conn = null;
		Prodotto prodottoReturn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, username, password);
			String sql = "SELECT * FROM prodotto WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();

			if (!rs.next())
				return null;
			Prodotto p = creaProdottoDaResultSet(rs);

			// restituisco l'oggetto trovato
			prodottoReturn = p;
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Optional.ofNullable(prodottoReturn);
	}

	/**
	 *
	 */
	@Override
	public List<Prodotto> getAll() {
		String sql = "SELECT * FROM prodotto WHERE qty > 0";
		return listaProdotti(sql);
	}

	private Prodotto creaProdottoDaResultSet(ResultSet rs) throws SQLException {
		Prodotto p = new Prodotto();
		p.setId(rs.getLong("id"));
		p.setNome(rs.getString("nome"));
		p.setDescrizione(rs.getString("descrizione"));
		p.setQty(rs.getInt("qty"));
		p.setPrezzo(rs.getDouble("prezzo"));
		return p;
	}

	private List<Prodotto> listaProdotti(String sql) {
		List<Prodotto> lista = new ArrayList<Prodotto>();
		// try catch con auto chiusura. Non si necessita di finally
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next())
				lista.add(creaProdottoDaResultSet(rs));

		} catch (SQLException e) {
			System.err.println("Errore Database " + e.getMessage());
		}
		return lista;
	}
}
