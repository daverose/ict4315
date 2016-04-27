package ict4315.unit5;

import org.junit.Test;
import static org.junit.Assert.assertTrue;



public class SavingsAccountTest {
    SavingsAccount savAct = new SavingsAccount("2001", 1);
    SavingsAccount savAct1 = new SavingsAccount("2001", 100);


@Test (expected = IllegalArgumentException.class)
    public void dontAllowAccountToBeOpenedWithLessThanOneCent(){
        SavingsAccount myAccount = new SavingsAccount("40001",0); // Created just to test the constructor.

    }
      @Test
  public void balanceNotNegative() {
          SavingsAccount myAccount = new SavingsAccount("40001",1);
      assertTrue(myAccount.getBalance() > 0);
    }

    @Test
    public void interestRateNotNegative () {
        SavingsAccount myAccount = new SavingsAccount("40001",100);
        assertTrue(myAccount.getInterestRate() >= 0);
    }
    @Test
    public void depositIncreasesBalanceByDeposit () {
        int currentBal = savAct.getBalance();
        savAct.deposit(100);
        currentBal += 100;
        assertTrue(savAct.getBalance() == currentBal );

    }
    @Test
    public void withdrawalDecreasesBalanceByWithdrawal () {
        int currentBal = savAct1.getBalance();
        savAct1.withdraw(50);
        currentBal -= 50;
        assertTrue(savAct1.getBalance() == currentBal );

    }
//    @Test
//    public void interestAddedAfter30Days () {
//
//    }
  }

