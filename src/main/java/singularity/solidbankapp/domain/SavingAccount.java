package singularity.solidbankapp.domain;
public class SavingAccount extends AccountWithdraw {
    public SavingAccount(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
            super(accountType, id, clientID, balance, withdrawAllowed);
    }
}

