package AdvancedExercise.Generics.CustomList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();
        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command){
                case"Add":
                    customList.add(data[1]);
                    break;
                case "Remove":
                    int index = Integer.parseInt(data[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    if (customList.contains(data[1])){
                        System.out.println("true");
                    }else {
                        System.out.println("false");
                    }
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);
                    customList.swap(index1,index2);
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(data[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case"Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    customList.forEach(System.out::println);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
