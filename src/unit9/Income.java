package unit9;

/**
 * Created by daverose on 5/21/16.
 */
public interface Income {
    public void addPersonalIncome(int cents);
    public void addRentalInfrom(int cents);
    public void addLongTermSockGains(int cents);
    public void addShortTermStockGains(int cents);
}
