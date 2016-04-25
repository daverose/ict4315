package ict4315.unit5;


public class CheckingAccount extends Account {
    private int overDraft = 0;
    CheckingAccount(final String actNumber, int initialDeposit) {
        accountNumber = actNumber;
        balance = initialDeposit;
    }
    public void setOverDraft(int oD) {
        overDraft = oD;
    }
    public int getOverDraft() {
        return overDraft;
    }
}
