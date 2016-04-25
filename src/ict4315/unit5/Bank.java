package ict4315.unit5;


public class Bank {

    public static void main(String args[]) {
        SavingsAccount myAccount = new SavingsAccount("102100", 200000);
        CheckingAccount myCheckingAccount = new CheckingAccount("102100", 200000, 3000);{
        System.out.println(myAccount);
            System.out.println(myCheckingAccount);
        }

    }
}
