package AdvancedExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayDeque <String> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        String[] input1 = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        for (int i = 0; i < n; i++) {
            stack.push(input1[i]);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.contains(String.valueOf(x))){
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        }else {
            int minNum = Integer.MAX_VALUE;
            for (String number : stack) {
                if (Integer.parseInt(number) < minNum) {
                   minNum = Integer.parseInt(number);
                }
            }
            System.out.println(minNum);
        }
    }
}
