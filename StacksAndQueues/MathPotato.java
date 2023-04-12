package AdvancedLab;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        PriorityQueue <String> priorityQueue = new PriorityQueue<>();
        Collections.addAll(priorityQueue, input);

        int currentCount = 1;

        while (priorityQueue.size() > 1){
            for (int i = 1; i < count; i++) {
                priorityQueue.offer(priorityQueue.poll());
            }
            if (prime(currentCount)){
                System.out.println("Prime " + priorityQueue.peek());

            }else {
                System.out.println("Removed " + priorityQueue.poll());
            }
            currentCount++;
        }
        System.out.println("Last is " + priorityQueue.poll());

    }
    private static boolean prime (int number){
        if (number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
