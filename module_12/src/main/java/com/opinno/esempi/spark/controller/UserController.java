package com.opinno.esempi.spark.controller;

import com.google.gson.Gson;
import com.opinno.esempi.spark.controller.utility.HttpResponse;
import com.opinno.esempi.spark.service.UserService;
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
    public void startWebServices() {

        // Espongo un servizio GET (Read) verso l'esterno

        /*
         * Metodo GET esposto verso l'esterno che risponde sull'endpoint
         * http://localhost:5436/helloworld e che torna una semplice stringa
         * */
        get("/helloworld", (req, res) -> "Saluti da Java :)");

        // Dammi tutti gli utenti che abbiamo nel database (SELECT * FROM users)
        get("/users", (req, res) -> {
            // Devo specificare che voglio un JSon altrimenti potrei avere formati diversi
            res.type("application/json");

            // Creo un oggetto di tipo HttpResponse scritto da noi dove converto la mia lista
            HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userService.getUsers()));

            // Converto tutta la mia risposta in JSon
            return new Gson().toJson(response);
        });

        //  queryParams --> "?nome_parametro=" nel mio endpoint, leggo un parametro dal mio endpoint associato ad un nome
        //  es. http://localhost:5436/helloworld/getUser?id=1
        get("/getUser", (req, res) ->{
            // recupera il valore associato al queryParam "id" --> ?id=1
            try
            {
                Long id = Long.parseLong(req.queryParams("id"));
                log.info("paramID: " + id);

                // Creo un oggetto di tipo HttpResponse scritto da noi dove converto la mia lista
                HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userService.getUsersByID(id)));

                // Converto tutta la mia risposta in JSon
                return new Gson().toJson(response);
            }
            catch (NumberFormatException e)
            {
                return new Gson().toJson(new HttpResponse("404", new Gson().toJsonTree("parametro ID obbligatorio")));
            }
        });


        //  path        --> ":nome_parametro" nel mio endpoint, dove :nome_parametro verrà sostituito dal valore
        //  es. http://localhost:5436/user/1
        get("/user/:id", (req, res) ->{
            // Devo specificare che voglio un JSon altrimenti potrei avere formati diversi
            res.type("application/json");

            // recupera il valore associato nel path ad :id --> /user/:id --> /user/1
            long id = Long.parseLong(req.params("id"));
            log.info("user id: " + id);

            // Creo un oggetto di tipo HttpResponse scritto da noi dove converto la mia lista
            HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userService.getUsersByID(id)));

            // Converto tutta la mia risposta in JSon
            return new Gson().toJson(response);
        });



    }
}
