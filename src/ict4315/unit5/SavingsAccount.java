package ict4315.unit5;


import java.util.ArrayList;

public class SavingsAccount extends Account {
    private float interest = 0;
    private float interestRate;
    private int dailySum;
    private float dailyAverage;
    private ArrayList<Integer> dailyTransactions = new ArrayList<>();
    private ArrayList<Integer> transactionsInBillingCycle = new ArrayList<>();

    private float averageDailyBalanceForStatementPeriod(int daysInBillingCycle) {
        for (int i = 0; i < daysInBillingCycle; ++i) {
            for (int n = 0; n < dailyTransactions.size(); ++n) {
                dailySum += (dailyTransactions.indexOf(n));
                if (dailyTransactions.indexOf(n) == dailyTransactions.size() - 1) {
                    dailyAverage = dailySum / n ;
                    transactionsInBillingCycle.add( n , (int)dailyAverage );
                }
            }
            interest += transactionsInBillingCycle.get(i) * interestRate;
        }
        return interest;
    }


    SavingsAccount(final String actNumber, int initialDeposit) {
        accountNumber = actNumber;
        if ((initialDeposit) > 0){
            balance = initialDeposit;
        } else {
            throw new IllegalArgumentException("Initial balance can not be zero. Customer must open an account with a deposit.");
        }
    }
    public void setInterestRate(float interestRate){
        interestRate = this.interestRate;
    }
}
