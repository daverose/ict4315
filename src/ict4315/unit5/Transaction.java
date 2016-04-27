package ict4315.unit5;

import java.text.DateFormat;
import java.util.Date;


public class Transaction {
    private String accountNumber;
    private String date;
    private int transaction;
    private int balance;
    private boolean overDrafLetterSent;

public void sendOverDraftLetter(){
    this.overDrafLetterSent = true;
}

    public void setAccountNumber(String actNum) {
        accountNumber = actNum;
    }

    public void setDate() {
        date = getDate();
    }

    public void setTransaction(int amount) {
        transaction = amount;
    }

    public void setBalance(int bal) {
        balance = bal;
    }

    public String getDate() {
        Date today;
        String dateOut;
        DateFormat dateFormatter;

        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        today = new Date();
        dateOut = dateFormatter.format(today);
        return dateOut;

    }
    public String toString(){
        return String.format("Account Number: " + accountNumber + " Date: " + date + " Transaction: " + transaction + " OverDraft Sent: " + overDrafLetterSent + " Current Balance : " + "$%d", balance / 100);
    }
}


