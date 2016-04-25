package ict4315.unit5;


import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertTrue;



public class SavingsAccountTest {



@Test (expected = IllegalArgumentException.class)
    public void dontAllowAccountToBeOpenedWithLessThanOneCent(){
        SavingsAccount myAccount = new SavingsAccount("40001",0); // Created just to test the constructor.


    }
      @Test
  public void balanceNotNegative() {
          SavingsAccount myAccount = new SavingsAccount("40001",1);
      assertTrue(myAccount.getBalance() > 0);
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

