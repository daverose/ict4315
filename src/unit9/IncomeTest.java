package unit9;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class IncomeTest {
    PersonalIncome myIncome = new PersonalIncome();

    @Test
    public void addPersonalIncomeTest() {
        try {
            myIncome.addPersonalIncome(200000);
        } catch (IllegalArgumentException e) {
            System.out.println("Adding zero or a negative number to the income is not allowed");
        }
        int incomeBeforeAddition = myIncome.getPersonalIncome();
        int addedIncome = 2000;
        myIncome.addPersonalIncome(addedIncome);
        assertTrue(myIncome.getPersonalIncome() - addedIncome == incomeBeforeAddition );
    }
    @Test(expected = IllegalArgumentException.class)
    public void addPersonalIncomeNotNegative() {
        myIncome.addPersonalIncome(-200);
    }

    @org.junit.Test
    public void addRentalIncome() {
        int incomeBeforeAddingRental = myIncome.getPersonalIncome();
        int rentalIncome = 100000;
        try {
            myIncome.addRentalIncome(rentalIncome);
        } catch (IllegalArgumentException e) {
            System.out.println("Adding zero or a negative number to rental income is not allowed");
        }
        assertTrue(myIncome.getPersonalIncome() - rentalIncome == incomeBeforeAddingRental);

    }
    @Test ( expected = IllegalArgumentException.class)
    public void addRentalIncomeNotNegative() {
        myIncome.addRentalIncome(-200000);
    }

    @org.junit.Test
    public void addLongTermSockGains() throws Exception {
        int incBeforeLongTermStockGains = myIncome.getPersonalIncome();
        int longTermStockGains = 50000;
        try {
            myIncome.addLongTermStockGains(longTermStockGains);
        } catch (IllegalArgumentException e) {
            System.out.println("Adding zero or a negative number to Long term stock gains income is not allowed");
        }
        assertTrue(myIncome.getPersonalIncome() - longTermStockGains == incBeforeLongTermStockGains);
    }
    @Test( expected = IllegalArgumentException.class)
    public void addLongTermStockGainsNotNegative() {
        myIncome.addLongTermStockGains(-10000);
    }

    @org.junit.Test
    public void addShortTermStockGains() throws Exception {
        int incBeforeShortTermStockGains = myIncome.getPersonalIncome();
        int shortTermStockGains = 100000;
        try {
            myIncome.addShortTermStockGains(shortTermStockGains);
        } catch (IllegalArgumentException e) {
            System.out.println("Adding zero or a negative number to short term stock gains is not allowed");
        }
        assertTrue(myIncome.getPersonalIncome() - shortTermStockGains == incBeforeShortTermStockGains);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addShortTermSockGainsNotNegative() {
        myIncome.addShortTermStockGains(-30000);
    }

}