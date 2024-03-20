package org.example.dao.impl.collections;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.RestaurantDao;
import org.example.model.Restaurant;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Log
public
class RestaurantDaoCollectionsImpl implements RestaurantDao {
    private Map<Integer, Restaurant> restaurantMap = new HashMap<>();

    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantMap.put(restaurant.getId(), restaurant);

        log.info("Ristorante {} aggiunto alla collezione" + restaurant.getName());
    }

    @Override
    public void printRestaurants() {
        log.info("Lista dei ristoranti:");

        if (restaurantMap.isEmpty()) {
            log.info("Nessun ristorante presente.");
        } else {
            for (Restaurant restaurant : restaurantMap.values()) {
                log.info("ID: {}" + restaurant.getId());
                log.info("Nome: {}" + restaurant.getName());
                log.info("Menu:");
                for (Map.Entry<String, String> menuItem : restaurant.getMenu().entrySet()) {
                    log.info(menuItem.getKey() + " - " + menuItem.getValue());
                }
                log.info("------------------------------------");
            }
        }
    }
}

