package unit9;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TaxPayerTest {
    @Test
    public void getTaxOwed() throws Exception {
        TaxPayer bill = new TaxPayer();
        int tax = 500000;
        bill.setTaxOwed(tax);
        assertTrue(tax == bill.getTaxOwed());

    }

}