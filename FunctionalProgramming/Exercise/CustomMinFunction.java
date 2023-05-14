package AdvancedExercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;


public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsStrings = scanner.nextLine();
        Integer[] numbersArr = Arrays.stream(numberAsStrings.split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function <Integer[], Integer> function = (arr) -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        };
        System.out.println(function.apply(numbersArr));
    }
}