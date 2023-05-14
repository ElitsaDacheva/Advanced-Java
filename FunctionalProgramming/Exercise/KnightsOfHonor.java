package AdvancedExercise.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Consumer<String> print = e -> System.out.println("Sir " + e);
        for (String e: input) {
            print.accept(e);
        }
    }
}
