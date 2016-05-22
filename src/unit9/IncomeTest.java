package unit9;

import static org.junit.Assert.assertTrue;

import com.sun.glass.ui.SystemClipboard;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;


public class IncomeTest {
    PersonalIncome myIncome = new PersonalIncome();

    @Test
    public void addPersonalIncomeTest() {
        try {
            myIncome.addPersonalIncome(20000);
        } catch (IllegalArgumentException e) {
            System.out.println("Did you try to add zero or a negative to the income?");
        }
        int incomeBeforeAddition = myIncome.getPersonalIncome();
        int addedIncome = 2000;
        myIncome.addPersonalIncome(addedIncome);
        int updatedIncome = myIncome.getPersonalIncome();
        assertTrue(myIncome.getPersonalIncome() - addedIncome == incomeBeforeAddition );
    }
    @Test(expected = IllegalArgumentException.class)
    public void addPersonalIncomeNotNegative() {
        myIncome.addPersonalIncome(-200);
    }

    @org.junit.Test
    public void addRentalIncome() {

    }

    @org.junit.Test
    public void addLongTermSockGains() throws Exception {

    }

    @org.junit.Test
    public void addShortTermStockGains() throws Exception {

    }

}