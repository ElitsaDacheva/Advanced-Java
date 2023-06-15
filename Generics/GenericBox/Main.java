package AdvancedExercise.Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericsBox> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GenericsBox<Double> genericsBox = new GenericsBox<>(Double.parseDouble(scanner.nextLine()));
            boxes.add(genericsBox);
        }
//        String[] commandData= scanner.nextLine().split("\\s+");
//        int firstIndex = Integer.parseInt(commandData[0]);
//        int secondIndex = Integer.parseInt(commandData[1]);
//        swap(boxes,firstIndex, secondIndex);
//        boxes.forEach(System.out::println);

        GenericsBox <Double> boxToCompare = new GenericsBox<>(Double.parseDouble(scanner.nextLine()));
        int output = countGreatResults(boxes, boxToCompare);
        System.out.println(output);
    }
    private static <T extends Comparable> int countGreatResults (List<T> data,T element){
        int count = 0;
        for (T e :data ){
            int result = e.compareTo(element);
            if (result > 0){
                count++;
            }
        }
        return count;
    }
    private static <T> void swap(List<T> data, int firstIndex, int secondIndex) {
        T first = data.get(secondIndex);
        T second = data.get(firstIndex);
        data.set(firstIndex, first);
        data.set(secondIndex, second);
    }
}
