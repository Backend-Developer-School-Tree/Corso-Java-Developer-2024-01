package module_09.src.esercizi.movies;

import module_09.src.esercizi.movies.entities.User;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * La classe avrà un metodo per ogni funzionalità che dobbiamo implementare con il Database.
 * es. inserisci utente, ottieni tutti i film guardati da un certo utente, ecc.
 *
 * Funzionalità:
 *
 * - Scrivere delle query SQL per creare degli utenti e dei film all'interno del database
 * - Scrivere una query SQL per salvare una serie di film preferiti dato l'id di un utente (utilizzando gli id dei film e dell'utente)
 * - Scrivere una query SQL per segnare che un utente ha guardato un film (utilizzando gli id del film e dell'utente)
 * - Scrivere una query SQL per lasciare una recensione per un film da parte di un utente (utilizzando gli id del film e dell'utente)
 */
public class Database
{
    private final Connection connection;

    public Database(Properties properties) throws SQLException
    {
        // connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/movies", properties);
        connection = getConnectionFromProperties(properties);
    }

    private Connection getConnectionFromProperties(Properties props) throws SQLException
    {

        // "jdbc:postgresql://localhost:5432/movies"
        String connectionUrl = "jdbc:"                  // jdbc:
                + props.getProperty("dbms") + "://"     // jdbc:postgresql://
                + props.getProperty("db_url") + ":"     // jdbc:postgresql://localhost
                + props.getProperty("db_port") + "/"    // jdbc:postgresql://localhost:5432
                + props.getProperty("db_name");         // jdbc:postgresql://localhost:5432/movies

        return DriverManager.getConnection(connectionUrl, props);
    }

    public void close() throws SQLException { this.connection.close(); }

    // Bruno:
    // l'id è autoincrementale nel database (Serial) quindi non possiamo prenderlo in input
    // public void insertUser(int id, String name, String lastName, LocalDateTime birthday) {}

    // Luca:
    public User insertUser(String name, String lastName, LocalDate birthday) throws SQLException
    {
        return insertUser(new User(name, lastName, birthday));
    }

    // Luca:
    // l'id dell'oggetto User deve poter essere null in quanto lo vogliamo impostare successivamente tramite setId
    // dopo che il DB ha generato il valore seriale autoincrement
    public User insertUser(User user) throws SQLException {
        String query = "INSERT INTO public.user (nome, cognome, data_nascita) VALUES (?, ?, ?)";

        // aggiungere PreparedStatement.RETURN_GENERATED_KEYS ci permette di ottenere il valore generato da Serial
        PreparedStatement ps = this.connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, user.getNome());
        ps.setString(2, user.getCognome());
        ps.setDate(3, Date.valueOf(user.getDataNascita()));

        int updatedRows = ps.executeUpdate();

        // questo ResultSet conterrà i valori generati, in questo caso il singolo id dell'utente appena inserito
        ResultSet rs = ps.getGeneratedKeys();

        // essendo una singola tupla (singolo valore/riga) basta un if al posto del while
        // assegnamo l'id generato all'oggetto user già esistente
        if (rs.next()) user.setId(rs.getInt(1));

        rs.close();
        ps.close();
        // NOTA: SE CHIUDESSIMO LA CONNECTION QUI, DOVREMMO RICREARLA ALLA PROSSIMA QUERY CHE VOGLIAMO ESEGUIRE
        // connection.close();

        // return updatedRows > 0; // se è maggiore di 0 --> inserimento ha funzionato

        return user;
    }


    /**
     * Ritorna uno specifico utente
     *
     * @param id id dell'utente da ricercare
     * @return l'utente associato all'id in input
     * @throws SQLException
     */
    public User getUser(int id) throws SQLException
    {
        String query = "SELECT * FROM public.user WHERE id = ?";

        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        User user = null;
        if (rs.next())
        {
            // creiamo un oggetto user dai valori contenuti nel ResultSet
            /*
            user = new User(
                    rs.getInt("id"), // --> uguale ad utilizzare direttamente la variabile "id"
                    rs.getString("nome"),
                    rs.getString("cognome"),
                    rs.getDate("data_nascita")
            );
            */
            user = new User(rs);
        }

        rs.close();
        ps.close();

        return user;
    }

    /**
     * Ritorna tutti gli utenti esistenti
     *
     * @return la lista di utenti
     * @throws SQLException
     */
    public List<User> getUsers() throws SQLException
    {
        String query = "SELECT * FROM public.user";

        PreparedStatement ps = this.connection.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        List<User> users = new ArrayList<>();
        while (rs.next())
        {
            users.add(new User(rs));
        }

        rs.close();
        ps.close();

        return users;
    }

    public void insertMovie() {}

    public void insertFavouriteMovie() {}

    public void insertWatchedMovie() {}

    public void insertReview() {}

    public static void main(String[] args) throws SQLException
    {
        // DriverManager.getConnection("jdbc:postgresql://localhost:5432/movies", "postgres", "postgres");
        // spostiamo tutte le informazioni necessarie per la configurazione in un oggetto Properties
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");
        props.setProperty("db_name", "movies");
        props.setProperty("db_port", "5432");
        props.setProperty("db_url", "localhost");
        props.setProperty("dbms", "postgresql");

        Database db = new Database(props);

        db.insertUser("Andrea", "Gasparini", LocalDate.of(1998, 16, 11));
        db.insertUser("Mario", "Mario", LocalDate.of(1981, 10, 11));

        User user = new User("Andrea", "Gasparini", LocalDate.of(1998, 16, 11));
        System.out.println(user.getId()); // --> null
        db.insertUser(user);
        System.out.println(user.getId()); // --> valore generato dal DB

        db.close();
    }
}
