package esercizi.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire un numero n (>= 0):");
        int num = myScanner.nextInt();
        int nthElement = getNthFibonacciElement(num);
        System.out.println("n-esimo elemento della sequenza di Fibonacci: " + nthElement);
    }

    public static int getNthFibonacciElement(int n) {
        if (n <= 1) {
            return n;
        } else {
            int penultimateNumber = 0;
            int lastNumber = 1;
            int currentNumber = 0;
            for (int i = 0; i < n - 2; i++) {
                currentNumber = lastNumber + penultimateNumber;
                penultimateNumber = lastNumber;
                lastNumber = currentNumber;
            }
            return currentNumber;
        }
    }
}
