package esercizi.binary_search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire un numero n: ");
        int n = myScanner.nextInt();
        int[] arrayNumbers = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int indexFound = recursiveBinarySearch(arrayNumbers, n, 0, arrayNumbers.length - 1);
        if (indexFound != -1) {
            System.out.println("Numero trovato in posizione: " + indexFound);
        } else {
            System.out.println("Numero non trovato");
        }
    }

    public static int recursiveBinarySearch(int[] arrayNumbers, int number, int low, int high) {
        if (low == high) {
            return number == arrayNumbers[low] ? low : -1;
        }
        int medium = low + ((high - low) / 2);
        if (arrayNumbers[medium] == number) {
            return medium;
        } else if (arrayNumbers[medium] > number) {
            return recursiveBinarySearch(arrayNumbers, number, low, medium - 1);
        } else {
            return recursiveBinarySearch(arrayNumbers, number, medium + 1, high);
        }
    }
}
