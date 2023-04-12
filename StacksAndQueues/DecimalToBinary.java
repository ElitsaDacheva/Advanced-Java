package AdvancedLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque <String> stack = new ArrayDeque<>();

        if (decimal < 0){
            System.out.println("Cannot handle negative integers");
            return;
        }
        if (decimal == 0){
            System.out.println("0");
            return;

        }

        while (decimal > 0){
            int bit = decimal % 2;
            stack.push(String.valueOf(bit));

            decimal /= 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
