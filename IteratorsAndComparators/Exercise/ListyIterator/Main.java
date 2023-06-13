package ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator();
        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            switch (data[0]){
                case "Create":
                    if (data.length > 1) {
                        String[] elements = Arrays.copyOfRange(data, 1, data.length);
                        listyIterator = new ListyIterator(elements);
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "PrintAll":
                    listyIterator.PrintAll();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
                case "Print":
                    try {
                        System.out.println(listyIterator.Print());
                    }catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
