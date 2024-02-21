package esercizi.numero_opposto;

import java.util.Scanner;

public class NumeroOpposto {
    public static void main(String[] args) {
        /*
        ESERCIZIO "NUMERO OPPOSTO"
        Scrivere un programma Java in grado di prendere in ingresso da tastiera un intero x e stampare a video il valore –x.
         */

        // Prendo il numero intero in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int x = myScanner.nextInt();

        // Calcolo il valore opposto
        int xOpposite = x * -1;

        // Stampo su console il valore ottenuto
        System.out.println("Valore con segno invertito: " + xOpposite);
    }
}
