package module_09.src.esempi.jdbc_140324;

import model.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Credenziali di PostgreSQL.
        // TODO: Usare classe Properties di Java
        String username = "postgres";
        String password = "postgres";
        String urlConnection = "jdbc:postgresql://localhost:5432/movie_platform";

        /*
        Step 0 --> Carico il Driver in memoria, in teoria non più necessario nelle nuove versioni
        Per chi ha MySQL: https://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-connect-drivermanager.html
        */
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(urlConnection, username, password);

        System.out.println("Connessione stabilita! Schema: " + conn.getSchema());


        // Uso il PreparedStatement
        PreparedStatement ps_all_film = conn.prepareStatement("SELECT * FROM film WHERE nome = ?");
        ps_all_film.setString(1, "Ombre nel Buio");
        ResultSet rs = ps_all_film.executeQuery();

        List<Film> films = new ArrayList<>();
        Film f;

        // VADO A LEGGERE I RECORDS
        while(rs.next()){
            f = new Film(rs.getInt("id"), rs.getString("nome"), rs.getString("direttore"));
            films.add(f);
        }
        ps_all_film.close();

        System.out.println(films);

        // VADO AD INSERIRE DATI IN TABELLA
        PreparedStatement ps_insert_film = conn.prepareStatement("INSERT INTO film (Nome, Direttore) VALUES (?, ?)");
        ps_insert_film.setString(1,"Nome JDBC"); //In posizione 1 ho il nome
        ps_insert_film.setString(2,"Direttore JDBC"); //In posizione 2 ho il direttore

        int row_affected = ps_insert_film.executeUpdate();
        System.out.println("Inserimento completato " + row_affected );
        ps_insert_film.close();

        conn.close();
        rs.close();
    }
}
