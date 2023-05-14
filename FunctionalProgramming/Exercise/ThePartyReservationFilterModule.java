package AdvancedExercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> invitations = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        HashMap <String, Predicate> predicateMap = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Print")){
            String[] data = input.substring(input.indexOf(";") + 1).split("([ ;]+)");
            int index = 2;
            if (data.length == 2){
                index = 1;
            }
            String command = data[0] + data[index];
            if (input.contains("Add")){
                Predicate <String> predicate = null;

                switch (data[0]){
                    case "Starts":
                        predicate = e -> e.startsWith(data[2]);
                        predicateMap.putIfAbsent(command, predicate);
                        break;
                    case "Ends":
                        predicate = e -> e.endsWith(data[2]);
                        predicateMap.putIfAbsent(command, predicate);
                        break;
                    case "Length":
                        predicate = e -> e.length() == Integer.parseInt(data[2]);
                        predicateMap.putIfAbsent(command, predicate);
                        break;
                    case "Contains":
                        predicate = e -> e.contains(data[1]);
                        predicateMap.putIfAbsent(command, predicate);
                        break;
                }

            } else {
                predicateMap.remove(command);
            }
            input = scanner.nextLine();
        }
        for (String people : invitations) {
            boolean going = true;
            for (String entry : predicateMap.keySet()) {
                if (predicateMap.get(entry).test(people)){
                    going = false;
                }
            }
            if (going){
                System.out.print(people + " ");
            }
        }
    }
}
