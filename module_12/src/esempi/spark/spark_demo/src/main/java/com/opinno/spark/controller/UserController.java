package com.opinno.spark.controller;

import com.google.gson.Gson;
import com.opinno.spark.controller.utility.HttpResponse;
import com.opinno.spark.service.UserService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import static spark.Spark.get;

@Slf4j
@Log
/* Classe che contiene i miei servizi REST (ricorda CRUD) */
public class UserController {
    UserService userService;

    public UserController(){
        userService = new UserService();
    }

    /* Questo metodo fa partire i servizi REST */
    public void startWebServices(){

        // Espongo un servizio GET (Read) verso l'esterno

        /*
        * Metodo GET esposto verso l'esterno che risponde sull'endpoint
        * http://localhost:5436/helloworld e che torna una semplice stringa
        * */
        get("/helloworld", (req, res) -> "Saluti da Java :)");

        // Dammi tutti gli utenti che abbiamo nel database (SELECT * FROM users)
        get("/users", (req, res) ->{
            // Devo specificare che voglio un JSon altrimenti potrei avere formati diversi
            res.type("application/json");

            // Creo un oggetto di tipo HttpResponse scritto da noi dove converto la mia lista
            HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userService.getUsers()));

            // Converto tutta la mia risposta in JSon
            return new Gson().toJson(response);
        });

        //  queryParams --> ? nel mio endpoint, leggo un parametro dal mio endpoint
        get("/user/:username", (req, res) ->{
            // Devo specificare che voglio un JSon altrimenti potrei avere formati diversi
            res.type("application/json");

            String paramID = req.queryParams("userid");
            log.info("paramID: " + paramID);

            /*String username = req.params("username");
            log.info("username: " + username);*/

            // Creo un oggetto di tipo HttpResponse scritto da noi dove converto la mia lista
            HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userService.getUsersByID(Long.valueOf(paramID))));

            // Converto tutta la mia risposta in JSon
            return new Gson().toJson(response);
        });



    }
}
