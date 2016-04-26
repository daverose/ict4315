package ict4315.unit5;

import java.util.ArrayList;
import java.util.Date;

public class Bank {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String args[]) {
        SavingsAccount myAccount = new SavingsAccount("102100", 200000);
        myAccount.setInterestRate(.05);
        CheckingAccount myCheckingAccount = new CheckingAccount("102100", 200000, 3000);

        System.out.println(myAccount);
            System.out.println(myCheckingAccount);
        System.out.printf("The date is  " + myAccount.getDate());
        }

    }

