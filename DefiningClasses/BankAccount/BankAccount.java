package AdvancedLab.DefiningClasses.BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int counter = 1;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }
    public void deposit(double money) {
        this.balance += money;
    }
    public static void setInterestRate (double interestRate){
        BankAccount.interestRate = interestRate;
    }
    public double getInterestRate (int years){
        return BankAccount.interestRate * years * this.balance;
    }

}
