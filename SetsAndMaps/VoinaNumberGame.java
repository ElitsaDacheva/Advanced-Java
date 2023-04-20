package AdvancedLab.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        LinkedHashSet <Integer> firstCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet <Integer> secondCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds --> 0){
            int first = firstCards.iterator().next();
            firstCards.remove(first);
            int second = secondCards.iterator().next();
            secondCards.remove(second);
            if (first > second){
                firstCards.add(first);
                firstCards.add(second);
            } else if (second > first) {
                secondCards.add(first);
                secondCards.add(second);
            }
            if (firstCards.isEmpty() || secondCards.isEmpty()){
                break;
            }
        }
        if (firstCards.size() > secondCards.size()){
            System.out.println("First player win!");
        } else if (secondCards.size() > firstCards.size()) {
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
