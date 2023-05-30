package AdvancedLab.DefiningClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();
        String commands = scanner.nextLine();
        while (!commands.contains("End")){
            String[] line = commands.split("\\s+");
            if ("end".equalsIgnoreCase(line[0])){
                break;
            }
            switch (line[0]){
                case "Create":
                    create(bankAccountMap);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(line[1]);
                    double money = Double.parseDouble(line[2]);
                    deposit(id,money,bankAccountMap);
                    break;
                case "SetInterest":
                    setInterestRate(Double.parseDouble(line[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.parseInt(line[1]),Integer.parseInt(line[2]), bankAccountMap);
                    break;
            }
            commands = scanner.nextLine();
        }
    }
    public static void create (Map <Integer, BankAccount> bankAccountMap){
        BankAccount bankAccount = new BankAccount();
        bankAccountMap.put(bankAccount.getId(), bankAccount);
        System.out.println("Account ID" + bankAccount.getId() + " created");
    }
    public static void deposit (int id,double money, Map <Integer, BankAccount> bankAccountMap){
        if (bankAccountMap.containsKey(id)){
            bankAccountMap.get(id).deposit(money);
            System.out.printf("Deposited %.0f to ID%d%n", money, id);
        }else {
            System.out.println("Account does not exist");
        }
    }
    public static void setInterestRate (double interestRate){
        BankAccount.setInterestRate(interestRate);
    }
    private static void getInterest (int id, int years, Map<Integer, BankAccount> bankAccountMap){
        if (bankAccountMap.containsKey(id)){
            System.out.printf("%.2f%n", bankAccountMap.get(id).getInterestRate(years));
        }else {
            System.out.println("Account does not exist");
        }

    }
}
