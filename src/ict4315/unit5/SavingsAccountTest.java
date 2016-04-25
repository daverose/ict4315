package ict4315.unit5;


import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class SavingsAccountTest {
  SavingsAccount myAccount = new SavingsAccount("40001",-2);

  @Test
  public void balanceNotNegative() {
      assertTrue(myAccount.getBalance() > 0);
    }
    @Test(expected=IllegalArgumentException.class)
    public void dontAllowAccountToBeOpenedWithLessThanOneCent(){
        SavingsAccount myAccount = new SavingsAccount("40001",0);

    }
//    @Test
//    public void interestRateNotNegative () {
//
//    }
//    @Test
//    public void depositIncreasesBalanceByDeposit () {
//
//    }
//    @Test
//    public void withdrawalDecreasesBalanceByWithdrawal () {
//
//    }
//    @Test
//    public void interestAddedAfter30Days () {
//
//    }
  }

