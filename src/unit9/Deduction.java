package unit9;


public interface Deduction {
    void deductCharityContributions(int cents);
    void deductHomeInterest(int cents);
    void deductStockWashSale(int cents);
    void deductStandardSingle() throws Exception;
    void deductStandardMarried() throws Exception;
}
