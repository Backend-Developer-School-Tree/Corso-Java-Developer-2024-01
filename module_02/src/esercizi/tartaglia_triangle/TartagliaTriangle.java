package esercizi.tartaglia_triangle;

import java.util.Arrays;
import java.util.Scanner;

public class TartagliaTriangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire un numero n: ");
        int n = myScanner.nextInt();
        int[] rowTartagliaTriangle = getRowTartagliaTriangle(n);
        System.out.println(Arrays.toString(rowTartagliaTriangle));
    }

    public static int[] getRowTartagliaTriangle(int n) {
        if (n == 0) {
            return new int[]{ 0 };
        }
        int[] rowTartagliaTriangle = new int[n + 1];
        int[] previousRowTartagliaTriangle = getRowTartagliaTriangle(n - 1);
        rowTartagliaTriangle[0] = 1;
        rowTartagliaTriangle[rowTartagliaTriangle.length - 1] = 1;
        for (int i = 1; i < rowTartagliaTriangle.length - 1; i++) {
            rowTartagliaTriangle[i] = previousRowTartagliaTriangle[i - 1] + previousRowTartagliaTriangle[i];
        }
        return rowTartagliaTriangle;
    }
}
