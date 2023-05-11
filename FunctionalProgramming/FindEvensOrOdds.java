package AdvancedLab.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String type = scanner.nextLine();
        int lower = input.get(0);
        int upper = input.get(1);

        List<Integer> numbers = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            numbers.add(i);
        }
        Predicate<Integer> even = x -> x % 2 == 0;
        Predicate<Integer> odd = x -> x % 2 != 0;

        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (type.equals("even")) {
                if (even.test(num)) {
                    result.add(num);
                }
            } else {
                if (odd.test(num)) {
                    result.add(num);
                }
            }
        }
        for (int n: result) {
            System.out.print(n + " ");
        }
    }
}