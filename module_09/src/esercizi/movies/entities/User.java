package module_09.src.esercizi.movies.entities;

import java.time.LocalDateTime;

public class User
{
    int id;
    String nome;
    String cognome;
    LocalDateTime birthday; // Timestamp timestamp;

    public User(int id, String nome, String cognome, LocalDateTime birthday) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.birthday = birthday;
    }
}
