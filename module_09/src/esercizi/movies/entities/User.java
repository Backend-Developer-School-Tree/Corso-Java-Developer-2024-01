package module_09.src.esercizi.movies.entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class User
{
    private Integer id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita; // Timestamp timestamp;

    public User(int id, String nome, String cognome, LocalDate dataNascita) {
        this(nome, cognome, dataNascita);
        this.id = id;
    }

    public User(int id, String nome, String cognome, Date dataNascita) {
        this(nome, cognome, dataNascita);
        this.id = id;
    }

    public User(String nome, String cognome, LocalDate dataNascita) {
        // this.id = null;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public User(String nome, String cognome, Date dataNascita) {
        this(nome, cognome, LocalDate.from(dataNascita.toInstant()));
    }

    public User(ResultSet rs) throws SQLException {
        this(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cognome"),
                rs.getDate("data_nascita")
        );
    }

    public void setId(Integer id) { this.id = id; }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }
}
