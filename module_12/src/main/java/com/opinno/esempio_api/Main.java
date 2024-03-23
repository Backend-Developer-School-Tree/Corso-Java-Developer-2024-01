package com.opinno.esempio_api;


import com.opinno.esempio_api.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.startServices();
    }
}