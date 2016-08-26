package unit9;


public interface Income {
    void addPersonalIncome(int cents) throws Exception;
    void addRentalIncome(int cents);
    void addLongTermStockGains(int cents);
    void addShortTermStockGains(int cents);
}
