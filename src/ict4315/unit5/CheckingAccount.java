package ict4315.unit5;


public class CheckingAccount extends Account {
    private int overDraft;

    CheckingAccount(final String actNumber, int initialDeposit, int oD) {
        accountNumber = actNumber;
        balance = initialDeposit;
        overDraft = oD;
    }

    public void setOverDraft(int oD) {
        overDraft = oD;
    }

    public int getOverDraft() {
        return this.overDraft;
    }

@Override
    public void withdraw(int amount) {
        if (amount > balance + this.overDraft) {
            throw new IllegalArgumentException(String.format("Cannot withdraw more than your overdraft protection allows : $%d", overDraft - balance));
        } else if (balance - amount < this.overDraft) {
            balance -= amount;

            this.setOverDraft(balance + overDraft);
            int transactionField = amount;
            Transaction t = new Transaction();
            t.setAccountNumber(accountNumber);
            t.setBalance(balance);
            t.setDate();
            t.setTransaction(-transactionField);
            t.sendOverDraftLetter();
            bank.transactions.add(t);
        } else {
            balance -= amount;
            int transactionField = amount;
            Transaction t = new Transaction();
            t.setAccountNumber(accountNumber);
            t.setBalance(balance);
            t.setDate();
            t.setTransaction(-transactionField);
            bank.transactions.add(t);

        }
    }
}
