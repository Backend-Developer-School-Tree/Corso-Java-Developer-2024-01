package esercizi.array_fusion;

import java.util.Scanner;

public class ArrayFusion {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il numero D del primo array:");
        int d1 = myScanner.nextInt();
        int[] array1 = fillArray(d1);
        System.out.println("Array 1:");
        printIntArray(array1);

        System.out.println("Inserire il numero D del secondo array:");
        int d2 = myScanner.nextInt();
        int[] array2 = fillArray(d2);
        System.out.println("Array 2:");
        printIntArray(array2);

        int[] arrayConcat = concatArrays(array1, array2);
        System.out.println("Array Fused:");
        printIntArray(arrayConcat);
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

    public static int[] concatArrays(int[] array1, int[] array2) {
        int sumLength = array1.length + array2.length;
        int[] arrayOutput = new int[sumLength];
        for (int i = 0; i < sumLength; i++) {
            if (i < array1.length) {
                arrayOutput[i] = array1[i];
            } else {
                arrayOutput[i] = array2[i - array1.length];
            }
        }
        return arrayOutput;
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
