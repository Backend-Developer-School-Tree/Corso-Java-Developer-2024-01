package esempi.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandlerV2
{
    // 1. attributo statico del tipo della classe
    // che vogliamo rendere Singleton (quindi ConnectionHandler)
    // conterrà la nostra unica istanza possibile
    private static ConnectionHandlerV2 internalInstance;

    private Connection connection;

    // 2. costruttore privato
    private ConnectionHandlerV2(Properties props) throws SQLException
    {
        // operazioni di creazione della connessione
        connection = DriverManager.getConnection("...");
    }

    // 3. un metodo getInstance per recuperare l'istanzia già esistente
    // o crearla nel caso sia la prima invocazione
    public static ConnectionHandlerV2 getInstance(Properties props) throws SQLException
    {
        // 3.1 verifichiamo se l'istanza già esiste (se non è null)
        // e in caso contrario la istanziamo
        if (internalInstance == null)
        {
            if (props == null) throw new RuntimeException("The input properties should be not null to instantiate the ConnectionHandler class. Please call getInstance(Properties props) with a valid Properties object.");
            internalInstance = new ConnectionHandlerV2(props);
        }

        // 3.2 ritorniamo l'istanza già esistente
        return internalInstance;
    }

    public static ConnectionHandlerV2 getInstance() throws SQLException
    {
        return getInstance(null);
    }
}
