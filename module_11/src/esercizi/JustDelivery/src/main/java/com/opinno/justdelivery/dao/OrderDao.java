package com.opinno.justdelivery.dao;

import com.opinno.justdelivery.model.Order;

public interface OrderDao {

    void saveOrder(Order u);

    void printOrders();

}
