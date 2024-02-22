package esercizi.multiplication_tables;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il numero n:");
        int n = myScanner.nextInt();
        System.out.println("Inserire il numero m:");
        int m = myScanner.nextInt();

        int[] createdArray = createMultiplicationTable(n, m);
        printIntArray(createdArray);
    }

    public static int[] createMultiplicationTable(int n, int m) {
        int[] newArray = new int[m];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i * n;
        }
        return newArray;
    }

    public static void printIntArray(int[] arrayInput) {
        System.out.print("[");
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i]);
            if (i != arrayInput.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
