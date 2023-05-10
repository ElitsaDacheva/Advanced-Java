package AdvancedExercise.SetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        Map <String, Set <String>> players =  new LinkedHashMap<>();
        while (!input.equals("JOKER")){
            String name = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String [] cardsArr = cards.split(", ");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardsArr));


            if (!players.containsKey(name)){
                players.put(name, cardsSet);
            }else {
                Set <String> currentCards = players.get(name);
                currentCards.addAll(cardsSet);
                players.put(name, currentCards);
            }
            input = scanner.nextLine();
        }
        for (var entry: players.entrySet()) {
            Set<String> cards = entry.getValue();
            int points = calculate(cards);
            System.out.printf("%s: %d%n", entry.getKey(), points);
        }

    }
    public static int calculate(Set <String> cards) {
        Map<Character, Integer> symbolMap = getSymbols();

        int sumPoints = 0;

        for (String card : cards) {

            int points = 0;
            if (card.startsWith("10")) {
                char type = card.charAt(2);
                points = 10 * symbolMap.get(type);
            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolMap.get(power) * symbolMap.get(type);
            }
            sumPoints += points;
        }
        return sumPoints;
    }

    public static Map <Character, Integer> getSymbols(){
        Map<Character, Integer> values = new HashMap<>();
        values.put('2', 2);
        values.put('3', 3);
        values.put('4', 4);
        values.put('5', 5);
        values.put('6', 6);
        values.put('7', 7);
        values.put('8', 8);
        values.put('9', 9);
        values.put('J', 11);
        values.put('Q', 12);
        values.put('K', 13);
        values.put('A', 14);
        values.put('S', 4);
        values.put('H', 3);
        values.put('D', 2);
        values.put('C', 1);
        return values;
    }
}
