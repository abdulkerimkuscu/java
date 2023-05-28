package odevler;

import java.util.Arrays;

public class MatrisTranspose {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        System.out.println("Matrix: ");
        print(matrix);
        System.out.println("Transpose: ");
        change(matrix);
    }

    static void change(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }

        }
        print(transpose);
    }

    static void print(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}


