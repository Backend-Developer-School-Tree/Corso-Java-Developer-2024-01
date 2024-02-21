package esercizi.dati_anagrafici;

import java.util.Scanner;

public class DatiAnagrafici {
    public static void main(String[] args) {
        /*
        ESERCIZIO "DATI ANAGRAFICI"
        Scrivere un programma Java che permetta all’utente di inserire da tastiera il proprio nome e cognome.
        Una volta recuperati tali dati, essi dovranno essere stampati a video.
         */

        // Prendo i dati anagrafici in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String name = myScanner.nextLine();
        System.out.println("Inserisci il tuo cognome:");
        String lastName = myScanner.nextLine();

        // Stampo su console i dati
        System.out.println("Nome inserito: " + name);
        System.out.println("Cognome inserito: " + lastName);
    }
}
