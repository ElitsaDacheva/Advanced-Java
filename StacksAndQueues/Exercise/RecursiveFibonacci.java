package AdvancedExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    private static long[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];
        System.out.println(fib(n));
    }
    public static long fib (int n){
        //n = 1 -> F1 = 1
        //n = 2 -> F2 = 1
        if (n <= 1){
            return 1;
        }
        if (memory[n] != 0){
            return memory[n];
        }
        //n = 20
        //F20 = F19 + F18
        return memory[n] = fib(n - 1) + fib(n - 2);
    }
}
