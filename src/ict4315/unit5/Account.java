package ict4315.unit5;

/**
 * Representation of a bank account that cannot go overdrawn.
 *
 * All amounts are in PENNIES. Never use floats or doubles for money.
 */
public class Account {
    protected String accountNumber;
    protected int balance;

    Account(){

    }
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
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive: " + amount);
        }
        balance += amount;
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