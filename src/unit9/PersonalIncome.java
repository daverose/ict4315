package unit9;


public class PersonalIncome implements Income {
    private int personalIncome;

    public void addPersonalIncome(int cents) throws IllegalArgumentException {
        if (cents > 0) {
            this.personalIncome = personalIncome + cents;
        } else {
            throw new IllegalArgumentException("The value of cents added to personal income must be grater than zero");
        }
    }
    public void addShortTermStockGains(int cents) throws IllegalArgumentException {
        if ( cents > 0 ) {
            this.personalIncome = personalIncome + cents;
        } else {
            throw new IllegalArgumentException("The value of cents added to short term stock gains income must be grater than zero");
        }

    }
    public void addLongTermStockGains(int cents) {
        if (cents > 0) {
            this.personalIncome = personalIncome + cents;
        } else {
            throw new IllegalArgumentException("The value of cents added to long term stock gains income must be grater than zero");
        }
    }
    public void addRentalIncome(int cents) {
        if (cents >= 0) {
            this.personalIncome = personalIncome + cents;
        } else {
            throw new IllegalArgumentException("The value of cents added to rental income bust be less than zero");
        }
    }
    public int getPersonalIncome() {
        return this.personalIncome;
    }
}
