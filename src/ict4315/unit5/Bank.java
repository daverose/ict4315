package ict4315.unit5;


import java.util.ArrayList;

public class Bank {
    static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String args[]) {

        SavingsAccount myAccount = new SavingsAccount("102100", 200000);
        myAccount.setInterestRate(.05);
        myAccount.addBalanceToDailyTransaction(myAccount.getBalance());
        myAccount.deposit(10000);
        myAccount.addBalanceToDailyTransaction(myAccount.getBalance());
        myAccount.withdraw(500);
        myAccount.addBalanceToDailyTransaction(myAccount.getBalance());
        CheckingAccount myCheckingAccount = new CheckingAccount("102100-1", 200000, 30000);
        myCheckingAccount.deposit(500);
        System.out.println(String.format("Your overdraft is now: $%d", myCheckingAccount.getOverDraft() / 100));
        myCheckingAccount.withdraw(20000);
        myCheckingAccount.withdraw(10000);

        for (int i = 0; i < transactions.size(); ++i) {
            System.out.println(transactions.get(i));
        }
        System.out.println("Your interest rate is " + myAccount.getInterestRate());
        System.out.println("Your daily transactions are " + myAccount.getDailyTransactions());
        System.out.println("Your daily average is: " + myAccount.getDailyAverage());
        System.out.println("Your daily interest is: " + myAccount.computeInterest());


    }
}

