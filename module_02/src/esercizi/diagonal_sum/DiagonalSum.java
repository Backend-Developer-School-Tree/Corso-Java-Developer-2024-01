package esercizi.diagonal_sum;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 7, 0, -1 },
                { -1, 3, 8, 5 },
                { 2, 0, -2, 4 },
                { 6, 1, 5, 9 }
        };
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire verso diagonale (sinistra->destra = true, destra->sinistra = false): ");
        boolean diagonalChoice = myScanner.nextBoolean();
        int sumDiagonal = getSumDiagonal(matrix, diagonalChoice);
        System.out.println("Somma della diagonale " + (diagonalChoice ? "sinistra->destra" : "destra->sinistra") +
                ": " + sumDiagonal);
    }

    public static int getSumDiagonal(int[][] matrix, boolean diagonal) {
        // diagonal = true --> leftRight | diagonal = false --> rightLeft
        if (diagonal) {
            return getSumLeftRightDiagonal(matrix);
        } else {
            return getSumRightLeftDiagonal(matrix);
        }
    }

    public static int getSumLeftRightDiagonal(int[][] matrix) {
        int sumLeftRightDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumLeftRightDiagonal += matrix[i][i];
        }
        return sumLeftRightDiagonal;
    }

    public static int getSumRightLeftDiagonal(int[][] matrix) {
        int sumRightLeftDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumRightLeftDiagonal += matrix[matrix.length - 1 - i][i];
        }
        return sumRightLeftDiagonal;
    }
}
