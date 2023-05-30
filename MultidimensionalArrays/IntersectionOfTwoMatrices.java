package AdvancedLab.MultidimensinalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < firstMatrix.length; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = input[j].charAt(0);
            }
        }
        for (int i = 0; i <secondMatrix.length ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < secondMatrix[i].length; j++) {
                if (!(firstMatrix[i][j] == input[j].charAt(0))){
                    secondMatrix[i][j] = '*';
                }else {
                    secondMatrix[i][j] = input[j].charAt(0);
                }
            }
        }
        for (char[] items :secondMatrix) {
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%c ", items[i]);
            }
            System.out.println();
        }
    }
}
