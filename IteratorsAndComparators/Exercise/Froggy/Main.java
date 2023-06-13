package Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] elements = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        Lake lake = new Lake(elements);
        StringBuilder sb = new StringBuilder();
        for (Integer frog : lake) {
            sb.append(frog).append(", ");
        }
        System.out.println(sb.toString().substring(0, sb.lastIndexOf(", ")));
    }
}
