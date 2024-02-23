package esercizi.find_prime_numbers;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero N: ");
        int n = myScanner.nextInt();
        printPrimeNumbers(n);
    }

    public static void printPrimeNumbers(int n) {
        System.out.print("Lista numeri primi fino a " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
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
