package com.opinno.esempi.spark;

import com.opinno.esempi.spark.controller.UserController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserController userController = new UserController();
        userController.startWebServices();
    }
}
