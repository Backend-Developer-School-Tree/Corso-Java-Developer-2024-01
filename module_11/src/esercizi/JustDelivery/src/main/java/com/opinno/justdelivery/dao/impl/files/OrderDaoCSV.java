package com.opinno.justdelivery.dao.impl.files;

import com.opinno.justdelivery.dao.OrderDao;
import com.opinno.justdelivery.model.Order;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OrderDaoCSV implements OrderDao {
    public static final String CSV_FILE_NAME = "oders.csv";
    public static final Path PATH_FILE = Paths.get("src", CSV_FILE_NAME);

    @Override
    public void saveOrder(Order u) {

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(PATH_FILE.toString()))) {
            bw.write("ID, Timestamp Ordine, User Email"); //intestazione
            bw.newLine();
            System.out.println(u.order2commas());
            bw.write(u.order2commas());

        } catch (IOException ex){
            System.out.println(ex);
        }

    }

    @Override
    public void printOrders() {

    }
}
