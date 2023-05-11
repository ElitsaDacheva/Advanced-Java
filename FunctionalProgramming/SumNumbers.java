package AdvancedLab.FunctionalProgramming;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine().split(",\\s+");

        Function<String, Integer> function = Integer::parseInt;

        List<Integer> list = Arrays.stream(input)
                .map(function)
                .collect(Collectors.toList());

        int sum = Arrays.stream(input).mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + list.size());
        System.out.println("Sum = " + sum);
    }
}
