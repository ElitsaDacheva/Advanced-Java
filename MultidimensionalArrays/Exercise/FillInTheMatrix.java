package AdvancedExercise;

import java.util.Scanner;

public class FillInTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")){
            fillMatrixPatA(matrix);
        }else if (pattern.equals("B")){
            fillMatrixPatB(matrix);
        }
        print(matrix);

    }
    private static void fillMatrixPatA(int[][] matrix){
        int startNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNum;
                startNum++;

            }
        }
    }
    private static void fillMatrixPatB (int[][] matrix){
        int startNum = 1;
        for (int col = 0; col < matrix.length; col++) {
                if ((col + 1) % 2 == 0) {
                    for (int row = matrix.length - 1; row >= 0 ; row--) {
                        matrix[row][col] = startNum;
                        startNum++;
                    }

                }else {
                    for (int row = 0; row <= matrix.length - 1; row++) {
                        matrix[row][col] = startNum;
                        startNum++;
                    }
                }
        }
    }
    private static void print (int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
