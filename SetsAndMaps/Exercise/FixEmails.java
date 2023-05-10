package AdvancedExercise.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map <String, String> data = new LinkedHashMap<>();

        String name = scanner.nextLine();
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                data.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (var entry: data.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());

        }
    }
}
