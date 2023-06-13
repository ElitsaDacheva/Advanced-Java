package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        List<Person> personList =new ArrayList<>();
        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]), data[2]);
            personList.add(person);

            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());
        Person personToCompare = personList.get(n - 1);
        personList.remove(personToCompare);
        int equals = 0;
        int diff = 0;
        for (Person person : personList) {
            int result = personToCompare.compareTo(person);
            if (result == 0){
                equals++;
            }else {
                diff++;
            }
        }
        if (equals == 0){
            System.out.println("No matches");
        }else {
            System.out.print(equals + 1 + " " + diff + " " + (personList.size() + 1));
        }
    }
}
