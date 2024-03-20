package org.example.dao.impl.csv;

import org.example.dao.UserDao;
import org.example.model.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CsvUserDaoImpl implements UserDao {
    private static final String CSV_FILE_PATH = "users.csv";

    @Override
    public void addUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true))) {
            // Scrivi i dati dell'utente nel file CSV
            writer.write(user.getId() + "," + user.getName());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printUsers() {

    }
}