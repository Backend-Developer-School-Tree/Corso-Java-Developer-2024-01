package com.opinno.justdelivery.dao.impl.collections;

import com.opinno.justdelivery.dao.UserDao;
import com.opinno.justdelivery.model.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

// TODO: rendere un Singleton
@Log
@Slf4j
public class UserDaoCollections implements UserDao {

    Map<String, User> users = new HashMap<>();

    @Override
    public void saveUser(User u) {
        users.put(u.getEmail(), u);

        log.info("UTENTE INSERITO: " + u);
    }

    @Override
    public void printUsers() {
        log.info("ELENCO UTENTI: ");

        if(users.isEmpty()){
            log.info("NESSUN UTENTE INSERITO ");
        } else {
            for(User u : users.values()){
                log.info(u.toString());
                log.info("- - - - - - - - - - - - - - - ");
            }
        }
    }
}
