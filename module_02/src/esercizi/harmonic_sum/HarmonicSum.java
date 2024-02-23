package esercizi.harmonic_sum;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero n: ");
        int n = myScanner.nextInt();
        double nHarmonicSum = getHarmonicSum(n);
        System.out.println("La somma armonica di " + n + " è: " + nHarmonicSum);
    }

    public static double getHarmonicSum(int n) {
        if (n == 1) return 1;
        return ((double) 1 / n) + getHarmonicSum(n - 1);
    }
}
