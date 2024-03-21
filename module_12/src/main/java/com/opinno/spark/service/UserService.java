package com.opinno.spark.service;

import com.opinno.spark.model.User;

import java.util.ArrayList;
import java.util.List;

// Qui dovrei collegarlo al Dao di riferimento
public class UserService {
    List<User> users;

    public UserService(){
        users = new ArrayList<>();

        //Builder di Lombok
        User u1 = User.builder().id(1L).username("username12").build();
        User u2 = User.builder().id(2L).username("username21").build();

        users.add(u1);
        users.add(u2);
    }

    public List<User> getUsers(){
        //Se avessi un DAO, sarebbe daoUsers.getAllUsers();
        return users;
    }

    // Classe che va a cercare quello specifico user con quell'ID
    public User getUsersByID(Long id){
        // TODO: Ricerca all'interno della lista user che ha quell'ID
        return User.builder().id(1L).username("username12").build();
    }
}
