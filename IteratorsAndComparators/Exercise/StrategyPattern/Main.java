package StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Person> nameSet = new TreeSet<>(new NameComparator());
        Set<Person> ageSet = new TreeSet<>(new AgeComparator());
        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split(" ");
            Person person = new Person(personData[0], Integer.parseInt(personData[1]));
            nameSet.add(person);
            ageSet.add(person);

        }
        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);
    }
}
