package ict4315.unit5;


public class SavingsAccount extends Account {
    private float interest = 0;

    SavingsAccount(final String actNumber, int initialDeposit) {
        accountNumber = actNumber;
        if ((initialDeposit) > 0){
            balance = initialDeposit;
        } else {
            throw new IllegalArgumentException("Initial balance can not be zero. Customer must open an account with a deposit.");
        }
    }
}
