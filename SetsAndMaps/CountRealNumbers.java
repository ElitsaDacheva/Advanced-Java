package AdvancedLab.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map <Double, Integer> map = new LinkedHashMap<>();
        for (double item:input) {
            if (!map.containsKey(item)){
                map.put(item, 1);
            }else {
                map.put(item, map.get(item) + 1);
            }
        }
        for (Double entry : map.keySet()) {
            System.out.printf("%.0f -> %d", entry, map.get(entry));
        }
    }
}
