import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    }
}
