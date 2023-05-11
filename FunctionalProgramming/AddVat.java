package AdvancedLab.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine().split(",\\s+");

        UnaryOperator<Double> vatFunction = e -> 1.2 * e;
        Consumer <Double> print = e -> System.out.printf("%.2f%n", e);
        System.out.println("Prices with VAT:");
        Arrays.stream(input).map(Double::parseDouble).map(vatFunction).forEach(print);
    }
}
