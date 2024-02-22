package esercizi.mini_google;

import java.util.Scanner;

public class MiniGoogle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il numero D:");
        int d = myScanner.nextInt();
        int[] arrayGoogle = fillArray(d);

        System.out.println("Inserire il numero N da cercare:");
        int n = myScanner.nextInt();
        boolean resultSearch = findIntInArray(n, arrayGoogle);
        if (resultSearch) {
            System.out.println("Il numero " + n + " è presente nell'array");
        } else {
            System.out.println("Il numero " + n + " NON è presente nell'array");
        }
    }

    public static int[] fillArray(int arrayLength) {
        Scanner fillArrayScanner = new Scanner(System.in);
        int[] newArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Inserire un numero da inserire nell'array in posizione " + i + ":");
            newArray[i] = fillArrayScanner.nextInt();
        }

        return newArray;
    }

    public static boolean findIntInArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
}
