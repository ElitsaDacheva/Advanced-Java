package AdvancedExercise.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            if (!phoneBook.containsKey(name)) {
                phoneBook.put(name, number);
            } else {
                phoneBook.replace(name, number);
            }
            input = scanner.nextLine();
        }
        String names = scanner.nextLine();
        while (!names.equals("stop")) {
            if (phoneBook.containsKey(names)) {
                System.out.println( names + " -> " + phoneBook.get(names));
            }else {
                System.out.printf("Contact %s does not exist.%n", names);
            }
                names = scanner.nextLine();
        }
    }
}
