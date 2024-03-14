public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        /*
        Step 0 --> Carico il Driver in memoria, in teoria non più necessario nelle nuove versioni
        Per chi ha MySQL: https://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-connect-drivermanager.html
        */
        Class.forName("org.postgresql.Driver");

        System.out.println("Hello World!");

    }
}
