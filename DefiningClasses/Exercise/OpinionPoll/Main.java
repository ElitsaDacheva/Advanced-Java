package AdvancedExercise.DefiningClasses.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Person> peopleList = new ArrayList<>();
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            Person person = new Person(name, age);
            if (age > 30){
                peopleList.add(person);
            }
        }
       peopleList.sort(Comparator.comparing(Person::getName));
        for (Person person: peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
