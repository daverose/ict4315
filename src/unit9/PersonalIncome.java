package unit9;


public class PersonalIncome implements Income {
    private int personalIncome;

    public void addPersonalIncome(int cents) throws IllegalArgumentException {
        if (cents > 0) {
            this.personalIncome = personalIncome + cents;
        } else {
            throw new IllegalArgumentException("The value of cents added to income must be grater than zero");
        }
    }
    public void addShortTermStockGains(int cents) {
        this.personalIncome = personalIncome + cents;
    }
    public void addLongTermStockGains(int cents) {
        this.personalIncome = personalIncome + cents;
    }
    public void addRentalIncome(int cents) {
        this.personalIncome = personalIncome + cents;
    }
    public int getPersonalIncome() {
        return this.personalIncome;
    }
}
