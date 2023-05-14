package AdvancedExercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> add = numbers-> {
            numbers.replaceAll(integer -> integer + 1);
            return numbers;
        };

        Function<List<Integer>, List<Integer>> multiply = numbers ->{
                numbers.replaceAll(integer -> integer * 2);
        return numbers;
        };

        Function <List<Integer>, List<Integer>> subtract = numbers ->{
            numbers.replaceAll(integer -> integer - 1);
            return numbers;
        };
        Consumer<List<Integer>> print = list -> list.forEach(number -> System.out.print(number + " "));
        String commands = scanner.nextLine();
        while (!commands.equals("end")){
            switch (commands) {
                case "add":
                    if (numbersList.isEmpty()){
                        break;
                    }else {
                        add.apply(numbersList);
                    }
                    break;
                case "multiply":
                    if (numbersList.isEmpty()){
                        break;
                    }else {
                        multiply.apply(numbersList);
                    }
                    break;
                case "subtract":
                    if (numbersList.isEmpty()){
                        break;
                    }else {
                        subtract.apply(numbersList);
                    }
                    break;
                case "print":
                    print.accept(numbersList);
                    System.out.println();
                    break;
                default:
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
