package com.opinno.justdelivery.dao.impl.files;

import com.opinno.justdelivery.dao.OrderDao;
import com.opinno.justdelivery.model.Order;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// TODO: Rifattorizzare il codice mettendo in comune metodi ripetuti
public class OrderDaoCSV implements OrderDao {
    public static final String CSV_FILE_NAME = "oders.csv";
    public static final Path PATH_FILE = Paths.get("src", CSV_FILE_NAME);

    public OrderDaoCSV(){
        createFile();
    }

    private void createFile() {
        File newFile = null;

        try {
            if (!Files.exists(Paths.get(PATH_FILE.toString()))){
                newFile = new File(PATH_FILE.toString());
                newFile.createNewFile();
                printHeader();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveOrder(Order u) {

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(PATH_FILE.toString()), StandardOpenOption.APPEND)) {

            bw.write(u.order2commas());
            bw.newLine();
        } catch (IOException ex){
            System.out.println(ex);
        }

    }

    // TODO: Convertire le stringhe del file in oggetti Order e stamparli oppure tornarli
    @Override
    public void printOrders() {
        try (BufferedReader bw = Files.newBufferedReader(Paths.get(PATH_FILE.toString()))) {
            String line;

            while( (line = bw.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException ex){
            System.out.println(ex);
        }
    }

    //TODO: ottimizzare scrittura della linea
    private void printHeader(){
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(PATH_FILE.toString()))) {
            //intestazione
            bw.write("ID, Order TS, User Email");
            bw.newLine();

        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
