package org.example.dao.impl.collections;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.UserDao;
import org.example.model.User;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Log
public class UserDaoCollectionsImpl implements UserDao {
    private Map<Integer, User> userMap;

    public UserDaoCollectionsImpl() {
        this.userMap = new HashMap<>();
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getId(), user);
        log.info("Utente {} aggiunto alla collezione" + user.getName());
    }

    // Metodo per stampare le informazioni di tutti gli utenti
    public void printUsers() {
        log.info("Lista degli utenti:");

        if (userMap.isEmpty()) {
            log.info("Nessun utente presente.");
        } else {
            for (User user : userMap.values()) {
                log.info("ID: {}" + user.getId());
                log.info("Nome: {}" + user.getName());
                log.info("------------------------------------");
            }
        }
    }
}