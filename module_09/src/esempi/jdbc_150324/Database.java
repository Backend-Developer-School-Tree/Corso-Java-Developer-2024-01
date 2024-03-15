package module_09.src.esempi.jdbc_150324;

import module_09.src.esempi.jdbc_150324.model.User;

import java.sql.*;
import java.util.Properties;

public class Database
{
    static Connection connection;

    public static void main(String[] args) throws SQLException {
        // Explicitly loading the driver is no longer required since Java 1.6 for PostgreSQL
        // https://jdbc.postgresql.org/documentation/use/#loading-the-driver
        // Class.forName("org.postgresql.Driver");

        String username = "postgres";
        String password = "postgres";
        String databaseName = "movies";
        String databaseUrl = "localhost";
        String databasePort = "5432";
        String databaseDbms = "postgresql";
        String urlConnection = "jdbc:" + databaseDbms + "://" + databaseUrl + ":"  + databasePort + "/" + databaseName;

        // esistono vari modi per ottenere una connection con un DB postgresql

        // 1. specificando tutti i parametri nell'url
        connection = DriverManager.getConnection(urlConnection + "?user=" + username + "&password=" + password);

        // 2. specificando user e password come parametri del metodo getConnection
        // (eventuali altri parametri andranno comunque specificati nell'url)
        connection = DriverManager.getConnection(urlConnection, username, password);

        // 3. utilizzando un oggetto Properties: metodo più strutturato e robusto
        // (permette anche di caricare la configurazione direttamente da un file .properties)
        Properties databaseConfig = new Properties();
        databaseConfig.setProperty("user", username);
        databaseConfig.setProperty("password", password);
        // props.setProperty(...) // possiamo mettere altre informazioni di configurazione
        connection = DriverManager.getConnection(urlConnection, databaseConfig);

        insertUser(4, "Alessandro");

        // <------------------ QUERY IN JAVA ------------------>
        System.out.println("<------------------ QUERY IN JAVA ------------------>");

        // una volta che abbiamo istanziato un oggetto Connection abbiamo una connessione con il database
        // e possiamo inviare delle query e ricevere risposta tramite degli oggetti Statement

        // Nota: finché non abbiamo parametri da aggiungere nella query i due tipi di Statement sono equivalenti

        String query = "SELECT * FROM public.user;";
        System.out.println("\nQUERY: " + query);

        System.out.println("\n<------------------ CON STATEMENT ------------------>\n");

        // 1. con un oggetto Statement
        // creiamo un oggetto (che conterrà una query)
        Statement statement = connection.createStatement();
        // e lo eseguiamo sulla base di una query
        ResultSet rs = statement.executeQuery(query);
        // ritorna un ResultSet (un insieme delle righe (o tuple) ritornate dalla query)

        // finché ci sono informazioni da leggere
        // ovvero finché ci sono righe (tuple) nel risultato della query
        while (rs.next())
        {
            // recuperando il valore della colonna "id" e della colonna "name" (dalla riga/tupla corrente)
            System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
            // recuperiamo i valori delle colonne ad indice 1 e 2 (dalla riga/tupla corrente)
            System.out.println(rs.getInt(1) + " | " + rs.getString(2));
        }
        // il while termina quando non ci sono più righe/tuple da leggere (rs.next() == false)

        statement.close();

        System.out.println("\n<------------------ CON PREPARED STATEMENT ------------------>\n");

        // 2. con un oggetto PreparedStatement
        // creiamo un oggetto sulla base di una query
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // e lo eseguiamo successivamente con quella query
        rs = preparedStatement.executeQuery();
        // ritorna un ResultSet (un insieme delle righe (o tuple) ritornate dalla query)

        // finché ci sono informazioni da leggere
        // ovvero finché ci sono righe (tuple) nel risultato della query
        while (rs.next())
        {
            // recuperiamo il valore della colonna "id" e della colonna "name" (dalla riga/tupla corrente)
            System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
            // recuperiamo i valori delle colonne ad indice 1 e 2 (dalla riga/tupla corrente)
            System.out.println(rs.getInt(1) + " | " + rs.getString(2));
        }
        // il while termina quando non ci sono più righe/tuple da leggere (rs.next() == false)

        preparedStatement.close();
        rs.close();

        // <------------------ QUERY PARAMETRICHE IN JAVA ------------------>

        String nome = "Andrea"; // parametro nome da aggiungere alla query

        System.out.println("\n<------------------ CON STATEMENT ------------------>\n");

        query = "SELECT * FROM public.user WHERE name = '" + nome + "'";
        System.out.println("\nQUERY: " + query);

        Statement statement1 = connection.createStatement();
        ResultSet rs1 = statement1.executeQuery(query);

        while (rs1.next())
        {
            System.out.println(rs1.getInt("id") + " | " + rs1.getString("name"));
        }

        statement1.close();

        System.out.println("\n<------------------ CON PREPARED STATEMENT ------------------>\n");

        query = "SELECT * FROM public.user WHERE name = ?";
        System.out.println("\nTEMPLATE DELLA QUERY:\n" + query);

        // creiamo l'oggetto PreparedStatement a partire da un "template" di una query
        // ovvero una query che deve essere ancora parametrizzata
        // (in cui dobbiamo sostituire i placeholder ? con i valori effettivi)
        PreparedStatement ps1 = connection.prepareStatement(query);
        ps1.setString(1, nome);

        System.out.println("\nQUERY DOPO ESSERE STATA PARAMETRIZZATA:\n" + ps1 + "\n");

        // eseguiamo la query parametrizzata (con i ? sostituiti come indicato)
        rs1 = ps1.executeQuery();

        while (rs1.next())
        {
            System.out.println(rs1.getInt("id") + " | " + rs1.getString("name"));

            User user = new User(rs1.getInt("id"), rs1.getString("name"));
        }

        ps1.close();
        rs1.close();

        // <------------------ INSERT IN JAVA ------------------>

        /*
        query = "INSERT INTO public.user (id, name) VALUES (?, ?)";
        // nel caso la colonna id sia Serial
        // query = "INSERT INTO public.user (name, ...) VALUES (?, ...)";
        PreparedStatement ps2 = connection.prepareStatement(query);
        ps2.setInt(1, 3);
        ps2.setString(2, "Gabriella");

        int updatedRows = ps2.executeUpdate();
         */

        // possiamo fare ogni query/insert/update/delete in un metodo a parte per non dover ripete ogni volta il codice
        insertUser(3, "Gabriella");

        // IMPORTANTE chiudere sempre tutte le risorse che lascerebbero risorse allocate altrimenti:
        // 1. PreparedStatement

        statement.close();
        statement1.close();
        preparedStatement.close();
        ps1.close();

        rs.close();
        rs1.close();

        connection.close();
    }

    // 1. void    --> tipo di ritorno che non da alcun tipo di informazione
    // 2. boolean --> inserimento è andato a buon fine
    // 3. User    --> utente appena inserito
    public static boolean insertUser(int id, String name) throws SQLException {
        // Connection connection; // = DriverManager.getConnection(urlConnection, databaseConfig);;

        String query = "INSERT INTO public.user (id, name) VALUES (?, ?)";
        // nel caso la colonna id sia Serial
        // query = "INSERT INTO public.user (name, ...) VALUES (?, ...)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);

        int updatedRows = ps.executeUpdate();

        // if updatedRows >= 1 inserimento a buon fine
        // if updatedRows == 0 inserimento non riuscito

        ps.close();
        // rs.close();
        // connection.close(); // IMPORTANTE se creiamo una nuova connection nel metodo stesso

        return updatedRows > 0;
    }
}
