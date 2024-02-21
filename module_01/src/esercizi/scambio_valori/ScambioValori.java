package esercizi.scambio_valori;

import java.util.Scanner;

public class ScambioValori {
    public static void main(String[] args) {
        /*
        ESERCIZIO "SCAMBIO DI VALORI"
        Scrivere un programma Java che acquisisca da tastiera due valori interi e li memorizzi nelle variabili varA e varB.
        In seguito, fare in modo di scambiare il valore di tali variabili e stamparne a schermo il nuovo contenuto.
         */

        // Prendo i due numeri interi in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il valore da salvare in varA:");
        int varA = myScanner.nextInt();
        System.out.println("Inserisci il valore da salvare in varB:");
        int varB = myScanner.nextInt();

        // Stampo su console i due valori iniziali
        System.out.println("Valore iniziale di varA: " + varA);
        System.out.println("Valore iniziale di varB: " + varB);

        // Tramite una variabile di appoggio varC scambio i valori di varA e varB
        int varC = varA;
        varA = varB;
        varB = varC;

        // Stampo su console i due valori scambiati
        System.out.println("------>");
        System.out.println("Valore scambiato di varA: " + varA);
        System.out.println("Valore scambiato di varB: " + varB);
    }
}
