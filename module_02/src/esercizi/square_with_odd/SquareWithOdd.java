package esercizi.square_with_odd;

import java.util.Scanner;

public class SquareWithOdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il valore N:");
        int n = myScanner.nextInt();

        int currentOdd = 1;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += currentOdd;
            currentOdd += 2;
        }

        System.out.println("Il quadrato di " + n + " è: " + totalSum);
    }
}
