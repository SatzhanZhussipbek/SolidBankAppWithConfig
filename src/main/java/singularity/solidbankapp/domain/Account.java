package singularity.solidbankapp.domain;

public class Account {
    private AccountType accountType;

    private long accountID;

    private String clientID;

    private double balance;

    private boolean withdrawAllowed;

    public Account(AccountType accountType, long accountID, String clientID, double balance, boolean
            withdrawAllowed) {
        this.accountType = accountType;
        this.accountID = accountID;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

    @Override
    public String toString() {
        return String.format("Account{id='%03d%06d', clientID='%s', balance='%.1f'}", 1, accountID, clientID, balance);
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public long getID() {
        return accountID;
    }

    public void setID(long accountID) {
        this.accountID = accountID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
