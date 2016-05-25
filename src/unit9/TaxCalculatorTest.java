package unit9;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TaxCalculatorTest {
    TaxCalculator tc = new TaxCalculator();
    TaxPayer dave = new TaxPayer();
    @Test
    public void setTaxOwed() throws Exception {
    dave.setMaritalStatus(true);
        dave.setIncome(2000, 30000, 0, 80750000); // sum = 80782000
        dave.setDeduction(1200000, 50000, 5000000); // 80782000 - 6250000 = 74532000 = Adj Inc
        int ti = dave.getTotalIncome();
        int td = dave.getTotalDeductions();
        int adj = ti - td;
       dave.setAdjustedIncome();
        tc.setTaxOwed(dave);
        assertTrue( dave.getTaxOwed() == 74532000);
    }

}