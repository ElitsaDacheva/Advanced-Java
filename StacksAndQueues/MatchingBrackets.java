package AdvancedLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String expression = scanner.nextLine();
        ArrayDeque <Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (character == '('){
                stack.push(i);
            } else if (character == ')') {
                int index = stack.pop();
                System.out.println(expression.substring(index, i + 1));
            }
        }
    }
}
