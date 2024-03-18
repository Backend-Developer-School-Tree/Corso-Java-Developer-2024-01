package esempi.singleton;

import java.sql.SQLException;
import java.util.Properties;

public class Test
{
    public static void main(String[] args) throws SQLException {
        // il costruttore non può essere utilizzato al di fuori della classe Singleton (essendo private)
        // new ConnectionHandler();

        /*
        ConnectionHandler ch = new ConnectionHandler();
        ConnectionHandler ch2 = new ConnectionHandler();

        System.out.println(ch == ch2);
         */

        ConnectionHandler ch = ConnectionHandler.getInstance();
        ConnectionHandler ch2 = ConnectionHandler.getInstance();

        System.out.println(ch == ch2);
    }
}
