package org.example;

import java.util.Optional;

public class User {
    long id;
    String name;

    User(long id1, String name1){
        id = id1;
        name = name1;
    }
    User(long id1){
        id = id1;
    }
    public String getName(){
        return name;
    }
    public Optional<String> getFirstName(){
        return Optional.ofNullable(name);
    }
    public void setName(String name1){
        name = name1;
    }
    public long getId(){
        return id;
    }
}
