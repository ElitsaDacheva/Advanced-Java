package AdvancedExercise.MultidimensinalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);

            }
        }
        int primary = 0;
        for (int i = 0; i < n; i++) {
            primary += matrix[i][i];
        }
        int secondory = 0;
        for (int i = 0; i < n; i++) {
            secondory += matrix[i][n - 1 - i];
        }
        if (primary >= secondory){
            System.out.println(primary - secondory);
        }else {
            System.out.println(secondory - primary);
        }
    }
}
