package AdvancedExercise.SetsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicalTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set <String> elementsSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] compounds = scanner.nextLine().split("\\s+");
            for (String element : compounds) {
                elementsSet.add(element);
            }
        }
        System.out.println(String.join(" ", elementsSet));
    }
}
