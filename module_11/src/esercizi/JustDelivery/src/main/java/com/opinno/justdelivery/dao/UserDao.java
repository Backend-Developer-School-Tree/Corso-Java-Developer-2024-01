package com.opinno.justdelivery.dao;

import com.opinno.justdelivery.model.User;

public interface UserDao {

    void saveUser(User u);

    void printUsers();
}
