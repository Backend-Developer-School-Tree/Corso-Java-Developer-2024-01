package com.opinno.justdelivery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Data --> Racchiude i costruttori obbligatori, i setter/getter, toString, equals and hashcode
* @NoArgsConstructor --> Implementa il costruttore di default
* @AllArgsConstructor --> Implementa il costruttore con tutti i parametri
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    String email;
    String name;

    public String user2commas(){
        return email + "," + name;
    }

    /* Codice scritto a tempo statico da Lombok :)

    public Users(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Users() {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }*/
}
