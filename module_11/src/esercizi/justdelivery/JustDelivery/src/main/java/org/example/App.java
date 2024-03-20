package org.example;

import org.example.dao.RestaurantDao;
import org.example.dao.UserDao;
import org.example.dao.impl.collections.RestaurantDaoCollectionsImpl;
import org.example.dao.impl.collections.UserDaoCollectionsImpl;
import org.example.dao.impl.csv.CsvUserDaoImpl;
import org.example.model.Restaurant;
import org.example.model.User;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        // Creazione del DAO per gli utenti
        UserDao userDao = new UserDaoCollectionsImpl();

        // Creazione degli utenti utilizzando il builder di Lombok
        User user1 = User.builder().id(1).name("John Doe").build();

        User user2 = User.builder().id(2).name("Jane Smith").build();

        // Aggiunta degli utenti al DAO
        userDao.addUser(user1);
        userDao.addUser(user2);

        // Creazione del DAO per i ristoranti
        RestaurantDao restaurantDao = new RestaurantDaoCollectionsImpl();

        // Creazione dei ristoranti utilizzando il builder di Lombok
        Restaurant restaurant1 = Restaurant.builder()
                .id(1)
                .name("Pizzeria Bella Napoli")
                .menu(new HashMap<>() {{
                    put("1", "Margherita");
                    put("2", "Diavola");
                }})
                .build();

        Restaurant restaurant2 = Restaurant.builder()
                .id(2)
                .name("Trattoria da Mario")
                .menu(new HashMap<>() {{
                    put("1", "Spaghetti Carbonara");
                    put("2", "Tagliatelle al Ragu");
                }})
                .build();

        // Aggiunta dei ristoranti al DAO
        restaurantDao.addRestaurant(restaurant1);
        restaurantDao.addRestaurant(restaurant2);

        // Stampare gli utenti
        userDao.printUsers();
        // Stampare i ristoranti
        restaurantDao.printRestaurants();

        // USER DAO
        UserDao userDaoCsv = new CsvUserDaoImpl();
        userDao.addUser(user1);
        userDao.addUser(user2);


    }
    }

