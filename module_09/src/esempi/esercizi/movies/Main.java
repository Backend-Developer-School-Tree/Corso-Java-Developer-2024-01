package module_09.src.esempi.esercizi.movies;

import java.sql.*;

/**
 * Realizzare un db per una piattaforma di gestione di film: ogni film deve avere un nome e un direttore.
 * Gli utenti della piattaforma hanno un nome, un cognome e possono salvare una serie di film preferiti, oltre che naturalmente guardare film.
 * Infine, ogni utente può lasciare una recensione di un film.
 * 1) Elencare tutti i film di un determinato direttore.
 * 2) Visualizzate tutti i film visti da un utente.
 * 3) Visualizzare tutti i film che hanno avuto più di tre recensioni.
 * 4) Visualizzare i primi 3 film più visti del 2023.
 */
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/movies?" + "user=root&password=");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        //Elencare tutti i film di un determinato direttore.
        getAllFilmByDirector(conn,"Franco Bianchi");
        // tutti i film visti dall'utente Prato
        getAllFilmByUser(conn,"Marcello Prato");
        // i film che hanno avuto almeno 3 recensioni
        getAllFilmReview(conn);
        // i 3 film più visti del 2024
        getFilmByDate(conn, 2024);
    }
    private static void getFilmByDate(Connection conn, int anno) {
        // Visualizzare i primi 3 film più visti del 2024
        String sql = "SELECT COUNT(*) AS NUM_VISTO, movie.title FROM movie, watch WHERE movie.id = watch.idmovie AND watch.datetime LIKE '"+ anno + "-%' GROUP BY movie.id ORDER BY NUM_VISTO";
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("i primi 3");
            int i = 0;
            while(rs.next() && i <3) {
                int numVisti = rs.getInt(1);
                System.out.println(numVisti + " " + rs.getString(2));
                i++;
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    private static void getAllFilmReview(Connection conn){
        //   Visualizzare tutti i film che hanno avuto più di tre recensioni.
        String sql = "SELECT movie.title, COUNT(*) AS NUM_VISTI FROM movie, review where movie.id = review.idmovie GROUP BY review.idmovie";
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("Film con più di 3 recensioni");
            while(rs.next()) {
                int numVisti = rs.getInt(2);
                if(numVisti >3) {
                    System.out.println(rs.getString(1));
                }
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    private static void getAllFilmByDirector(Connection conn, String name){
        try {
            PreparedStatement stmt = conn.prepareStatement("select movie.*, director.name FROM movie,director WHERE director.id = movie.director AND director.name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)); //ID
                System.out.println(rs.getString(2)); //NOME FILM
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    private static void getAllFilmByUser(Connection conn, String nameuser){
        try {
            PreparedStatement stmt=conn.prepareStatement("SELECT movie.title FROM user,watch, movie WHERE user.id=watch.id AND movie.id = watch.idmovie AND user.name = ?"); //oggetto necessario per interrogare il db
            stmt.setString(1,nameuser);
            ResultSet rs=stmt.executeQuery();
            System.out.println("Film visti dall'utente " + nameuser);
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}