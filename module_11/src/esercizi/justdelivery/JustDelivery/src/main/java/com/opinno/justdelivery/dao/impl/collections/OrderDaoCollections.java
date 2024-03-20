package com.opinno.justdelivery.dao.impl.collections;

import com.opinno.justdelivery.dao.OrderDao;
import com.opinno.justdelivery.model.Order;
import com.opinno.justdelivery.model.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

// TODO: rendere un Singleton
@Log
@Slf4j
public class OrderDaoCollections implements OrderDao {

    // Long è classe wrapper, long è il tipo primitivo
    private Map<Long, Order> orders = new HashMap<>();

    //Ricorda il getId lo abbiamo grazie a Lombok!
    @Override
    public void saveOrder(Order u) {
        orders.put(u.getId(), u);

        log.info("ORDINE INSERITO: " + u);
    }

    @Override
    public void printOrders() {
        log.info("ELENCO ORDINI: ");

        if(orders.isEmpty()){
            log.info("NESSUN ORDINE INSERITO ");
        } else {
            for(Order o : orders.values()){
                log.info(o.toString());
            }
        }
    }
}
