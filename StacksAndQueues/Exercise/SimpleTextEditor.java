package AdvancedExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentTextBuilder = new StringBuilder();
        ArrayDeque <String> textStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            
            if (command.startsWith("1")){
                textStack.push(currentTextBuilder.toString());
                String textToAdd = command.split("\\s+")[1];
                currentTextBuilder.append(textToAdd);
            } else if (command.startsWith("2")) {
                textStack.push(currentTextBuilder.toString());
                int count = Integer.parseInt(command.split("\\s+")[1]);
                currentTextBuilder.delete(currentTextBuilder.length() - count, currentTextBuilder.length());
            } else if (command.startsWith("3")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentTextBuilder.charAt(index - 1));
            } else if (command.startsWith("4")) {
                if (!textStack.isEmpty()){
                    currentTextBuilder = new StringBuilder(textStack.pop());
                }
            }

        }
    }
}
