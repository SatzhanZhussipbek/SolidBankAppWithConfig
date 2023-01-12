package singularity.solidbankapp.domain;
public class FixedAccount extends AccountDeposit {
    public FixedAccount(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
            super(accountType, id, clientID, balance, withdrawAllowed);
    }
}

