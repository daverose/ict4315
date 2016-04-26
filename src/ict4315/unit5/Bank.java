package ict4315.unit5;


import java.util.ArrayList;

public class Bank {
    static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String args[]) {

        SavingsAccount myAccount = new SavingsAccount("102100", 200000);
        myAccount.setInterestRate(.05);
        myAccount.deposit(10000);
        myAccount.withdraw(500);
        CheckingAccount myCheckingAccount = new CheckingAccount("102100-1", 200000, 3000);
        myCheckingAccount.deposit(50000);
        myCheckingAccount.withdraw(20000);

        for (int i = 0; i < transactions.size(); ++i) {
            System.out.println(transactions.get(i));
        }

    }
}

