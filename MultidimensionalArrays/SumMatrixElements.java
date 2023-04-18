package AdvancedLab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int sum = 0;
        for (int[] row : matrix) {
            for (int cell : row) {
                sum += cell;

            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
