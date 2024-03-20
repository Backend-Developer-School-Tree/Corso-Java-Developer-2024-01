package org.example.dao;

import org.example.model.Restaurant;

public interface RestaurantDao {
    void addRestaurant(Restaurant restaurant);
    void printRestaurants();

}
