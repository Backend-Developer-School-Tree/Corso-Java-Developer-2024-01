package org.example.dao;

import org.example.model.User;

public interface UserDao {
    void addUser(User user);
    void printUsers();
}
