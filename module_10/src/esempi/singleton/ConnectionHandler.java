package esempi.singleton;

import java.sql.SQLException;

public class ConnectionHandler
{
    // 1. attributo statico del tipo della classe
    // che vogliamo rendere Singleton (quindi ConnectionHandler)
    // conterrà la nostra unica istanza possibile
    private static ConnectionHandler internalInstance;

    // 2. costruttore privato
    private ConnectionHandler() throws SQLException
    {
        // operazioni di creazione della connessione
    }

    // 3. un metodo getInstance per recuperare l'istanzia già esistente
    // o crearla nel caso sia la prima invocazione
    public static ConnectionHandler getInstance() throws SQLException
    {
        // 3.1 verifichiamo se l'istanza già esiste (se non è null)
        // e in caso contrario la istanziamo
        if (internalInstance == null) internalInstance = new ConnectionHandler();

        // 3.2 ritorniamo l'istanza già esistente
        return internalInstance;
    }
}
