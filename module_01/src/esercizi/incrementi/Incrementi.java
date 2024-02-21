package esercizi.incrementi;

import java.util.Scanner;

public class Incrementi {
    public static void main(String[] args) {
        /*
        ESERCIZIO "INCREMENTI"
        Scrivere un programma Java che:
        riceva in input da console un numero intero
        stampi a console il numero effettuando contemporaneamente un post-incremento del numero
        stampi a console il valore del numero (quindi successivamente rispetto al post-incremento)
        stampi a console il numero effettuando contemporaneamente un pre-incremento del numero
        stampi a console il valore del numero (quindi successivamente rispetto al pre-incremento).

        Per le 4 stampe a console si concatenino i valori dei numeri con delle stringhe esplicative.
         */

        // Prendo il numero intero in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int x = myScanner.nextInt();

        // Stampo su console i risultati delle operazioni di incremento
        System.out.println("Valore di x iniziale: " + x);
        System.out.println("Valore di x con post-incremento: " + x++);
        System.out.println("Valore di x aggiornato: " + x);
        System.out.println("Valore di x con pre-incremento: " + ++x);
        System.out.println("Valore di x aggiornato: " + x);
    }
}
