package esercizi.operatori_aritmetici;

import java.util.Scanner;

public class OperatoriAritmetici {
    public static void main(String[] args) {
        /*
        ESERCIZIO "OPERATORI ARITMETICI"
        Scrivere un programma Java che permetta all’utente di inserire due numeri interi e successivamente stampi a
        video il risultato delle operazioni di addizione, sottrazione, moltiplicazione, divisione, resto
        eseguite tra i due numeri.
         */

        // Prendo i due numeri interi in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci primo numero:");
        int int1 = myScanner.nextInt();
        System.out.println("Inserisci secondo numero:");
        int int2 = myScanner.nextInt();

        // Calcolo i risultati degli operatori aritmetici applicati ai due numeri
        int sum = int1 + int2;
        int subtraction = int1 - int2;
        int product = int1 * int2;
        int division = int1 / int2;
        int remainder = int1 % int2;

        // Stampo su console i risultati
        System.out.println("Numeri inseriti: " + int1 + " e " + int2);
        System.out.println("Addizione: " + sum);
        System.out.println("Sottrazione: " + subtraction);
        System.out.println("Moltiplicazione: " + product);
        System.out.println("Divisione: " + division);
        System.out.println("Resto: " + remainder);
    }
}
