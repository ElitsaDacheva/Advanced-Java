package AdvancedExercise.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List <String> peopleList = Arrays.stream(scanner.nextLine().split("\\s+")).
                collect(Collectors.toCollection(ArrayList::new));

        String input = scanner.nextLine();
        while (!input.equals("Party!")){
            String criteria = input.split("\\s+")[2];

            Predicate <String> predicate = null;

            if (input.contains("Length")){
                predicate = e -> e.length() == Integer.parseInt(criteria);
            } else if (input.contains("StartsWith")) {
                predicate = e -> e.startsWith(criteria);
            }else {
                predicate = e -> e.endsWith(criteria);
            }

            if (input.contains("Remove")){
                List <String> toRemove = new ArrayList<>();
                for (String person : peopleList) {
                    if (predicate.test(person)){
                        toRemove.add(person);
                    }
                }
                peopleList.removeAll(toRemove);

            }else {
                List <String> toAdd = new ArrayList<>();
                for (String person : peopleList) {
                    if (predicate.test(person)){
                        toAdd.add(person);
                    }
                }
                peopleList.addAll(toAdd);

            }
            input = scanner.nextLine();
        }
        if (peopleList.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            System.out.println(peopleList.stream().sorted()
                    .collect(Collectors.toCollection(ArrayList::new)).toString().replaceAll("([\\[\\]])", "")
                    + " are going to the party!");
        }
    }
}
