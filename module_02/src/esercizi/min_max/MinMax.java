package esercizi.min_max;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire una stringa composta da numeri interi (es. 1,2,3):");
        String input = myScanner.nextLine();
        String[] inputSplit = input.split(",");
        int[] arrayInt = convertStringToIntArray(inputSplit);
        int arrayIntMin = findMin(arrayInt);
        int arrayIntMax = findMax(arrayInt);
        System.out.println("Il minimo tra i valori inseriti è: " + arrayIntMin);
        System.out.println("Il massimo tra i valori inseriti è: " + arrayIntMax);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] convertStringToIntArray(String[] arrayInput) {
        int[] arrayOutput = new int[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arrayOutput[i] = Integer.parseInt(arrayInput[i]);
        }
        return arrayOutput;
    }
}
