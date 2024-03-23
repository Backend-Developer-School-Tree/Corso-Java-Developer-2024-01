package com.opinno.esempio_api.controller;

import com.google.gson.Gson;
import com.opinno.esempio_api.entity.User;
import com.opinno.esempio_api.utility.HttpResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static spark.Spark.*;
public class UserController {

    List<User> users = new ArrayList<>();
    public void startServices(){
        post("/user", (req,res) -> {
            User userFromReq = new Gson().fromJson(req.body(), User.class);
            users.add(userFromReq);
            HttpResponse response = new HttpResponse("201", new Gson().toJsonTree(userFromReq));
            return new Gson().toJson(response);
        });
        get("/users", (req,res) ->{
           HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(users));
           return new Gson().toJson(response);
        });
        put("/user", (req,res) -> {
            User userFromReq = new Gson().fromJson(req.body(), User.class);
            boolean find = false;
            for(User u: users){
                if(u.getId() == userFromReq.getId()){
                    u.setUsername(userFromReq.getUsername());
                    find = true;
                }
            }
            if(find) {
                HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(userFromReq));
                return new Gson().toJson(response);
            }
            else{
                HttpResponse response = new HttpResponse("404", "Utente Non trovato");
                return new Gson().toJson(response);
            }
        });
        delete("/user/:userID", (req, res)-> {
           String s = req.params("userID");
           Long paramID = Long.parseLong(s);
           Iterator<User> i = users.iterator();
           while(i.hasNext()){
               User u = i.next();
               if(u.getId() == paramID){
                   i.remove();
               }
           }
           return new Gson().toJson(new HttpResponse("200", "User deleted"));
        });
    }
}
