package unit9;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DeductionTest {
    PersonalDeduction myDeductions = new PersonalDeduction();
    @Test
    public void newPersonalDeductionIsZero() {
        assertTrue(myDeductions.getDeductions() == 0);
    }

    @Test
    public void deductCharityContributions() {
        int myDeductionsBeforeCharity = myDeductions.getDeductions();
        int charity = 20000;
        myDeductions.deductCharityContributions(charity);
        int myDeductionsAfterCharity = myDeductions.getDeductions();
        assertTrue(myDeductionsAfterCharity - charity == myDeductionsBeforeCharity );
    }

    @Test
    public void deductHomeInterest() {
        int myDeductionsBeforeHomeInsterest = myDeductions.getDeductions();
        int homeInterest = 1300000;
        myDeductions.deductHomeInterest(homeInterest);
        int myDeductionsAfterHomeInterest = myDeductions.getDeductions();
        assertTrue( myDeductionsAfterHomeInterest - homeInterest == myDeductionsBeforeHomeInsterest);

    }

    @Test
    public void deductStockWashSale() {
        int myDeductionsBeforeStockWashSale = myDeductions.getDeductions();
        int stockWashSale = 40000;
        myDeductions.deductStockWashSale(stockWashSale);
        assertTrue( myDeductions.getDeductions() - stockWashSale == myDeductionsBeforeStockWashSale);
    }

    @Test
    public void deductStandardSingle() {
        int deductionsBeforeStandardSingle = myDeductions.getDeductions();
        myDeductions.deductStandardSingle();
        int deductionsAfterStandardSingle = myDeductions.getDeductions();
        assertTrue(deductionsAfterStandardSingle - myDeductions.getSingleStandardDeduction() == deductionsBeforeStandardSingle);
    }

    @Test
    public void deductStandardMarried() {
        int deductionsBeforeStandardMarried = myDeductions.getDeductions();
        try {
            myDeductions.deductStandardMarried();
        } catch (Exception e) {
            System.out.println("Already called standard married in test for deduct standard married");
        }
        int deductionsAfterStandardMarried = myDeductions.getDeductions();
        assertTrue(deductionsAfterStandardMarried - myDeductions.getMarriedStandardDeduction() == deductionsBeforeStandardMarried);
    }
    @Test(expected = Exception.class)
    public void canNotDeductMarriedMoreThanOnce() throws Exception {
        myDeductions.deductStandardMarried();
    }

}

