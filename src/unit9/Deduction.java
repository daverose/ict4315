package unit9;

/**
 * Created by daverose on 5/21/16.
 */
public interface Deduction {
    public void deductCharityContributions(int cents);
    public void deductHomeInterest(int cents);
    public void deductStockWashSale(int cents);
    public void deductStandardSingle(int cents);
    public void deductStandardMarried(int cents);
}
