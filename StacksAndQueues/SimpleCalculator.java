package AdvancedLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] data = scanner.nextLine().split("\\s+");
        Collections.addAll(stack, data);

        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());
            String del = stack.pop();
            int second = Integer.valueOf(stack.pop());

            if (del.equals("-")) {
                stack.push(String.valueOf(first - second));
            } else if (del.equals("+")) {
                stack.push(String.valueOf(first + second));
            }
        }
        System.out.println(stack.pop());
    }
}