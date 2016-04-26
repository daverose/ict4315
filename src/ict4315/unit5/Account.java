package ict4315.unit5;


import java.util.ArrayList;

/**
 * Representation of a bank account that cannot go overdrawn.
 *
 * All amounts are in PENNIES. Never use floats or doubles for money.
 */
public class Account {
    String accountNumber;
    int balance;
    Account(){

    }

    public Bank bank = new Bank();


    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive: " + amount);
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Cannot withdraw more than balance: " + amount);
        }
        balance -= amount;
        int transactionField = amount;
        Transaction t = new Transaction();
        t.setAccountNumber(accountNumber);
        t.setBalance(balance);
        t.setDate();
        t.setTransaction(-transactionField);
        bank.transactions.add(t);
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive: " + amount);
        }
        balance -= amount;
        int transactionField = amount;
        Transaction T = new Transaction();
        T.setAccountNumber(accountNumber);
        T.setBalance(balance);
        T.setDate();
        T.setTransaction(transactionField);
        bank.transactions.add(T);
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }



    @Override
    public String toString()
    {
        return String.format("Account[%s] balance: $%.2f", accountNumber, balance / 100.0);
    }
}