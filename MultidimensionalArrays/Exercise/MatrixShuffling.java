package AdvancedExercise.MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] matrixLength = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[matrixLength[0]][matrixLength[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String input = scanner.nextLine();
        while (!input.contains("END")){
            String[] tokens = input.split("\\s+");
           if (!validate(input)){
               System.out.println("Invalid input!");
               input = scanner.nextLine();
               continue;
           }
            boolean flag = false;
            for (int i = 1; i < tokens.length ; i++) {
                for (int j = 0; j < tokens[i].length(); j++) {
                    if (!Character.isDigit(tokens[i].charAt(j))){
                        System.out.println("Invalid input!");
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
            if (flag){
                input = scanner.nextLine();
                continue;
            }
            int oldRow = Integer.parseInt(tokens[1]);
            int oldCol = Integer.parseInt(tokens[2]);
            int newRow = Integer.parseInt(tokens[3]);
            int newCol = Integer.parseInt(tokens[4]);
            if (oldRow > matrix.length - 1 || oldCol > matrix[0].length - 1 || oldRow < 0 || oldCol < 0 ||
            newRow > matrix.length - 1 || newCol > matrix[0].length - 1 || newRow < 0 || newCol < 0){
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            String oldElement = matrix[oldRow][oldCol];
            String newElement = matrix[newRow][newCol];
            matrix[oldRow][oldCol] = newElement;
            matrix[newRow][newCol] = oldElement;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            input = scanner.nextLine();
        }

    }
    private static boolean validate (String input){
        String[] tokens = input.split("\\s+");
        if (!tokens[0].equals("swap") || tokens.length != 5) {
            return false;
        }
        return true;
    }
}
