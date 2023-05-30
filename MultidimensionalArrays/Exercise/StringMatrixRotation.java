package AdvancedExercise.MultidimensinalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().split("[()]")[1];
        int rotation = Integer.parseInt(input) % 360;
        int max = 0;

        List <String> inputList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("END")){
            inputList.add(command);
            if (command.length() > max){
                max = command.length();
            }
            command = scanner.nextLine();
        }
        int rows = inputList.size();
        int cols = max;
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > inputList.get(i).length() - 1){
                    matrix[i][j] = ' ';
                }else {
                    matrix[i][j] = inputList.get(i).charAt(j);
                }
            }
        }
        rotate(rotation, rows, cols, matrix);
    }
    private static void rotate (int rotation, int rows, int cols, char[][] matrix) {
        switch (rotation) {
            case 0:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int i = 0; i < cols ; i++) {
                    for (int j = rows - 1; j >= 0 ; j--) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int i = rows - 1; i >= 0; i--) {
                    for (int j = cols - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int i = cols - 1; i >= 0; i--) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}