package AdvancedExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int toAdd = scanner.nextInt();
        int toRemove = scanner.nextInt();
        int toCheck = scanner.nextInt();

        ArrayDeque <Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < toAdd; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < toRemove; i++) {
            queue.poll();
        }
        if (queue.contains(toCheck)){
            System.out.println("true");
        }else {
            if (queue.isEmpty()){
                System.out.println("0");
            }else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
