package AdvancedExercise.SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        Map <Character, Integer> symbolsMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!symbolsMap.containsKey(current)){
                symbolsMap.put(current, 1);
            }else {
                int currentOccurences = symbolsMap.get(current);
                symbolsMap.put(current, currentOccurences + 1);
            }
        }
        for (Map.Entry <Character, Integer> entry : symbolsMap.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }
    }
}
