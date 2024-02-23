package esercizi.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il valore di cui calcolare il fattoriale (> 0):");
        int n = myScanner.nextInt();
        int resultFactorial = factorial(n);
        System.out.println("Risultato fattoriale di " + n + ": " + resultFactorial);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
