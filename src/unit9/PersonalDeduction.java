package unit9;

public class PersonalDeduction implements Deduction{
    private int deductions = 0;
    private int singleStandardDeduction = 0;
    private int marriedStandardDeduction = 0;
    private static boolean marriedDeductionUsed = false;
    private static boolean singleDeductionUsed = false;

    public int getDeductions() {
        return this.deductions;
    }

    public void deductCharityContributions(int cents) {
        deductions += cents;
    }
    public void deductHomeInterest(int cents){
        deductions += cents;

    }
    public void deductStockWashSale(int cents){
        deductions += cents;
    }
    public void deductStandardSingle() {
        deductions += 680000;

    }
    public void deductStandardMarried() throws Exception{
        if (marriedDeductionUsed == true) {
            throw new Exception("You can only use this deduction once");
        } else {
                deductions += 1240000;
                marriedDeductionUsed = true;
        }
    }

    public int getSingleStandardDeduction() {
        singleStandardDeduction = 680000;
        return singleStandardDeduction;
    }
    public int getMarriedStandardDeduction() {
        marriedStandardDeduction = 1240000;
        return marriedStandardDeduction;
    }


}
