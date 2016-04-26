package ict4315.unit5;

import java.util.Date;

//This Transaction class is to be used in the Bank class to record all transations
//and iterate through them.

public class Transaction {
    private String accountNumber;
    private Date date;
    private int transaction;
    private int balance;
    private boolean overDrafLetterSent;
}
