package AdvancedLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];
        for (int i = 0; i < size; i++) {
            ;
            String[] columnData = scanner.nextLine().split(" ");

//            for (int j = 0; j < columnData.length; j++) {
            //               currentRow[j] = Integer.parseInt(columnData[j]);
            //           }

            int[] currentRow = Arrays.stream(columnData)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = currentRow;
        }
        //       for (int i = 0; i < matrix.length; i++) {
        //           for (int j = 0; j < matrix[i].length; j++) {
        //               if (i == j){
        //                   System.out.print(matrix[i][j] + " ");
        //                         }
        //           }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = size - 1, col = 0; col < size; i--, col++) {
            System.out.print(matrix[i][col] + " ");
        }
    }
}