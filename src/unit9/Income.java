package unit9;


public interface Income {
    public void addPersonalIncome(int cents) throws Exception;
    public void addRentalIncome(int cents);
    public void addLongTermStockGains(int cents);
    public void addShortTermStockGains(int cents);
}
