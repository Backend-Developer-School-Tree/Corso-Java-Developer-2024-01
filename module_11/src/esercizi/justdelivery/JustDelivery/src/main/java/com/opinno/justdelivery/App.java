package com.opinno.justdelivery;

import com.opinno.justdelivery.model.Order;
import com.opinno.justdelivery.model.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.event.Level;

import java.time.LocalDateTime;

@Slf4j
@Log
public class App {

    public static void main( String[] args ) {
        //log.info viene dalla annotazione @Slf4j e @Log, viene creato dal package di Self4j
        log.info("Messaggio di Log :) ");

        // pattern Builder implementato in Lombok
        User u1 = User.builder().name("Name 1").email("email@gmail.com").build();
        Order o1 = Order.builder().id(1L).dateTimeOrder(LocalDateTime.now()).user(u1).build();

        log.info(u1.toString()); //toString grazie a Lombok
        log.info(o1.toString()); //toString grazie a Lombok

    }
}
