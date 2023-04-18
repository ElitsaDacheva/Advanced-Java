package AdvancedLab;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(data[col]);

            }
        }
        int maxLeftRow = -1;
        int maxLeftCol = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length - 1 ; row++) {
            for (int col = 0; col < matrix[row].length - 1 ; col++) {
                int current = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (current > maxSum){
                    maxSum = current;
                    maxLeftRow = row;
                    maxLeftCol = col;
                }
            }
        }
        System.out.println(matrix[maxLeftRow][maxLeftCol] + " " + matrix[maxLeftRow][maxLeftCol + 1]);
        System.out.println( matrix[maxLeftRow + 1][maxLeftCol] + " " + matrix[maxLeftRow + 1][maxLeftCol + 1]);
        System.out.println(maxSum);
    }
}
