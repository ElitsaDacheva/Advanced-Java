package AdvancedLab.FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, Integer> people = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            people.put(name, age);

        }
        String comparison = scanner.nextLine();
        int limitAge = Integer.parseInt(scanner.nextLine());
        String typeToPrint = scanner.nextLine();

        BiPredicate <Integer, Integer> forFilter;
        if (comparison.equals("younger")) {
            forFilter = (personAge, age) -> personAge <= age;
        } else {
            forFilter = (personAge, age) -> personAge >= age;
        }

        Consumer <Map.Entry <String, Integer>> print;
        if (typeToPrint.equals("age")){
            print = person -> System.out.println(person.getValue());
        } else if (typeToPrint.equals("name")) {
            print = person -> System.out.println(person.getKey());
        }else {
            print = person -> System.out.printf("%s - %d%n",person.getKey(), person.getValue());
        }

        people.entrySet().stream()
                .filter(person -> forFilter.test(person.getValue(), limitAge))
                .forEach(print);
    }
}
