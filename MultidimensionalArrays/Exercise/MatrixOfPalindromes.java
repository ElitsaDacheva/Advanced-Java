package AdvancedExercise.MultidimensinalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        String[][] matrix = new String[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char outSymbol = (char) ('a' + i);
                char midSymbol = (char) (outSymbol + j);
                matrix[i][j] = String.valueOf(outSymbol) + String.valueOf(midSymbol) + String.valueOf(outSymbol);
            }
        }
        for (String[] element : matrix) {
            for (String current : element) {
                System.out.print(current + " ");
            }
            System.out.println();
        }
    }
}
