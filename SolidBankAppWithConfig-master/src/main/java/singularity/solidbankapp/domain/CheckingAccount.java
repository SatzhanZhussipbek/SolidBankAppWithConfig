package singularity.solidbankapp.domain;

public class CheckingAccount extends AccountWithdraw {
    public CheckingAccount(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
            super(accountType, id, clientID, balance, withdrawAllowed);
    }
}

