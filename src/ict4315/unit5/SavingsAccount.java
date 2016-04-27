package ict4315.unit5;


import java.util.ArrayList;

public class SavingsAccount extends Account {
    private double paidInterest;
    private double interestRate;
    private int dailySum;
    private double dailyAverage;
    private ArrayList<Integer> dailyTransactions = new ArrayList<>();
    private ArrayList<Float> dailyAveragesForBillingCycle = new ArrayList<>();

    public void addBalanceToDailyTransaction(int balanceAfterTransaction){
        dailyTransactions.add(balanceAfterTransaction);
    }

    public ArrayList<Integer> getDailyTransactions(){
        return dailyTransactions;
    }

    //This method iterates through dailyTransactions and sums them, then it divides the sum by the size of the ArrayList to get the average for the day.
    // This is missing a date comparison where it first looks at the date and determines if the next entry should be stored in the current day or a new day within
    // the dailyAveragesForBillingCycle arrayList .
    public double getDailyAverage() {
        for (Integer transaction : dailyTransactions) {
            dailySum += transaction;
        }
        dailyAverage = dailySum / dailyTransactions.size();
        System.out.println("Inside Daily average " + dailyAverage);
        return dailyAverage;
    }

    public double getMonthlyAverage() {
        double sum = 0;
        double aveDailyBalence;
        for (double averageOfDay : dailyAveragesForBillingCycle) {
            sum += averageOfDay;
        }
        aveDailyBalence = sum / dailyAveragesForBillingCycle.size();
        return aveDailyBalence;
    }
//
//                    daysInBillingCycle.add(dailyAverage);
//                    interest += daysInBillingCycle.get() * this.getInterestRate();
//                }
//        System.out.println("Interest that should be added to account is :" + interest);
//        return interest;
//    }


    SavingsAccount(final String actNumber, int initialDeposit) {
        accountNumber = actNumber;
        if ((initialDeposit) > 0) {
            balance = initialDeposit;
        } else {
            throw new IllegalArgumentException("Initial balance can not be zero. Customer must open an account with a deposit.");
        }
    }

    public void setInterestRate(double percent) {
        this.interestRate = percent;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
    public double computeInterest(){
        double dAve;
        double iRate;
        iRate= this.getInterestRate();
        dAve = this.getDailyAverage();
        System.out.println(dAve + " " + iRate);
        paidInterest = dAve * iRate;
        return paidInterest;
    }
}
