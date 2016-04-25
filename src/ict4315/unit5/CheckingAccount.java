package ict4315.unit5;


public class CheckingAccount extends Account {
    private int overDraft = 0;
    CheckingAccount(final String actNumber, int initialDeposit, int overDraft) {
        accountNumber = actNumber;
        balance = initialDeposit;
        overDraft = overDraft;
    }
    public void setOverDraft(int oD) {
        overDraft = oD;
    }
    public int getOverDraft() {
        return overDraft;
    }
}
