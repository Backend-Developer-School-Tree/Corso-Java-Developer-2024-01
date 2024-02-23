package esercizi.prime_number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per verificare se è primo: ");
        int a = myScanner.nextInt();
        if (isPrimeNumber(a)) {
            System.out.println("Il numero " + a + " è primo");
        } else {
            System.out.println("Il numero " + a + " NON è primo");
        }
    }

    public static boolean isPrimeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
