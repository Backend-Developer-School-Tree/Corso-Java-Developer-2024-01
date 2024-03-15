package module_09.src.esempi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryFinallyWithResources
{
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "postgres";
    public static final String DB_NAME = "movies";
    public static final String DB_PREFIX_URL = "jdbc:postgresql://localhost:5432/";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection(DB_PREFIX_URL + DB_NAME, DB_USERNAME, DB_PASSWORD);

        // ...
        // throw new RuntimeException("ERRORISSIMO");
        // cosa succederebbe se venisse sollevata una eccezione prima della chiusura della connessione con il DB?

        conn.close();

        // come si previene questa cosa? --> try-finally

        // <----------------------- try-finally --------------------->

        try {
            conn = DriverManager.getConnection(DB_PREFIX_URL + DB_NAME, DB_USERNAME, DB_PASSWORD);
        }
        // gestire l'eccezione
        // catch (SQLException e) { }

        // fare le operazioni che vanno sempre eseguite in ogni caso
        // es. pulire le risorse allocare, chiudere oggetti ecc
        finally {
            // preparedStatement.close()
            // resultSet.close()
            conn.close();                   // più grave da non chiudere!!!
        }

        // <----------------------- try-with-resources --------------------->

        // try-with-resources
        try (Connection connection = DriverManager.getConnection(DB_PREFIX_URL + DB_NAME, DB_USERNAME, DB_PASSWORD)) {
            // connection.prepareStatement(...)
        }
        // catch (...)

        // una volta usciti da un try-with-resources, tutte le risorse allocate tra le parentesi tonde del try
        // saranno in automatico chiuse come se ci fosse un blocco finally implicito con chiamate a .close()
    }
}
