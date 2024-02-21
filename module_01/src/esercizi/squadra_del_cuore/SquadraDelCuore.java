package esercizi.squadra_del_cuore;

import java.util.Scanner;

public class SquadraDelCuore {
    public static void main(String[] args) {
        /*
        ESERCIZIO "SQUADRA DEL CUORE"
        Scrivere un programma Java che permetta all’utente di inserire da tastiera i dati di nome, cognome e
        squadra di calcio tifata.
        Una volta recuperati tali dati, il programma deve mostrare a schermo la frase
        "Ciao <nome> <cognome>! La tua squadra del cuore è: <squadra>".
         */

        // Prendo i dati richiesti in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String name = myScanner.nextLine();
        System.out.println("Inserisci il tuo cognome:");
        String lastName = myScanner.nextLine();
        System.out.println("Inserisci la squadra di calcio che tifi:");
        String team = myScanner.nextLine();

        // Stampo su console i dati
        System.out.println("Ciao " + name + " " + lastName + "! La tua squadra del cuore è: " + team);
    }
}
