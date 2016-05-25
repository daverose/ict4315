package unit9;


import java.util.ArrayList;

public class TaxCalculator {
    public class TaxBracket {
        double taxRate;
        int minimumCentsForRate;
        int maximumCentsForRate;

        public TaxBracket(double taxRate, int minimumCentsForRate, int maximumCentsForRate) {
            taxRate = taxRate;
            minimumCentsForRate = minimumCentsForRate;
            maximumCentsForRate = maximumCentsForRate;
        }
    }
    public ArrayList<TaxBracket> getTaxRates(){
        TaxBracket ten = new TaxBracket(.10,0,9225000);
        TaxBracket fifteen = new TaxBracket(.15, 9226000, 37450000);
        TaxBracket twentyFive = new TaxBracket(.25, 37451000, 90750000);
        TaxBracket twentyEight = new TaxBracket(.28, 90751000, 189300000);
        TaxBracket thirtyThree = new TaxBracket(.33, 189301000, 411500000);
        ArrayList<TaxBracket> brackets = new ArrayList<>();
        brackets.add(0, ten);
        brackets.add(1, fifteen);
        brackets.add(2, twentyFive);
        brackets.add(3, twentyEight);
        brackets.add(4, thirtyThree);
        return brackets;
    }
    public void setTaxOwed(TaxPayer taxPayer) {
        ArrayList<TaxBracket>  brackets = getTaxRates();
        try {
            int adjInc = taxPayer.getAdjustedIncome();
            for (TaxBracket tb : brackets) {
                if (adjInc > tb.maximumCentsForRate && adjInc < tb.maximumCentsForRate) {
                    int tax = (int) (adjInc * (tb.taxRate/100f));
                    taxPayer.setTaxOwed(tax);
                }
            }
        } catch (Exception e) {
            System.out.println("The specifc taxpayer's Adj Income was never set");
        }

    }
}
