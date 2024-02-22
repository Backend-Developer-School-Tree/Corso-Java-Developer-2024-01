package esercizi.even_odd;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire un numero intero:");
        int numInput = myScanner.nextInt();
        if (numInput % 2 == 0) {
            System.out.println("Il numero inserito è PARI");
        } else {
            System.out.println("Il numero inserito è DISPARI");
        }
    }
}
