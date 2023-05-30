package AdvancedLab.MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < matrix.length; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix.length; j++) {
                matrix[i] = input;
            }
        }
        int rowInput = scanner.nextInt();
        int colInput = scanner.nextInt();
        int element = matrix[rowInput][colInput];
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                int current = matrix[row][col];
                if (element == current){
                    if (!(row - 1 < 0) && matrix[row -1][col] != element){
                        sum += matrix[row - 1][col];
                    }
                    if (!(row + 1 > matrix.length - 1) && matrix[row + 1][col] != element){
                        sum += matrix[row + 1][col];
                    }
                    if (!(col - 1 < 0) && matrix[row][col - 1] != element){
                        sum += matrix[row][col - 1];
                    }
                    if (!(col + 1 > matrix[row].length - 1) && matrix[row][col +1] != element){
                        sum += matrix[row][col + 1];
                    }
                    System.out.print(sum + " ");
                }else {
                    System.out.print(matrix[row][col] + " ");
                }
                sum = 0;
            }
            System.out.println();
        }
    }
}
