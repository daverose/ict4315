package unit9;

public class TaxPayer {
    private int totalIncome;
    private int totalDeductions;
    private int adjustedIncome;
    private PersonalDeduction deduction;
    private PersonalIncome income;
    private boolean married = false;
    private int taxOwed;
    private boolean taxOwedSet = false;
    private boolean setAdjIncome = false;

    public TaxPayer(){
        deduction = new PersonalDeduction();
        income = new PersonalIncome();
    }
    public TaxPayer(boolean married){
        this.married = married;
        deduction = new PersonalDeduction();
        income = new PersonalIncome();
    }
    public void setIncome(int sts, int lts, int rental, int personal ) {
        income.addShortTermStockGains(sts);
        income.addLongTermStockGains(lts);
        income.addRentalIncome(rental);
        income.addPersonalIncome(personal);
    }
    public void setDeduction(int home, int charity, int wash) {
        deduction.deductHomeInterest(home);
        deduction.deductCharityContributions(charity);
        deduction.deductStockWashSale(wash);
    }

    public void setMaritalStatus(boolean married) {
        this.married = married;
    }
    public int getTotalIncome() {
        return income.getPersonalIncome();
    }
    public int getTotalDeductions() {
        return deduction.getDeductions();
    }
    public int getAdjustedIncome() throws Exception {
        if (setAdjIncome) {
            return adjustedIncome;
        } else {
            throw new Exception("Adjusted Income must be set before it can be called.");
        }
    }
    public void setAdjustedIncome() {
        setAdjIncome = true;
        adjustedIncome = totalIncome - totalDeductions;
    }
    public void setTaxOwed(int tax) {
        taxOwedSet = true;
        taxOwed = tax;
    }
    public int getTaxOwed() throws Exception {
        if ( taxOwedSet) {
            return taxOwed;
        } else {
            throw new Exception("The taxOwed must be set before it can be returned");
        }
    }
}
