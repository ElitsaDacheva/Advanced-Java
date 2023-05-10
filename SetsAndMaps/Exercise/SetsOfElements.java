package AdvancedExercise.SetsAndMaps;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();

        String[] sizes = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(sizes[0]);
        int second = Integer.parseInt(sizes[1]);

        for (int i = 0; i < first; i++) {
            String number = scanner.nextLine();
            firstSet.add(number);
        }
        for (int i = 0; i < second; i++) {
            String number = scanner.nextLine();
            secondSet.add(number);
        }
        for (String element : firstSet) {
            if (secondSet.contains(element)) {
                System.out.print(element + " ");
            }
        }
    }
}
