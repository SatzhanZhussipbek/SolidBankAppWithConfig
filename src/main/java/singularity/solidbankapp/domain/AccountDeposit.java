package singularity.solidbankapp.domain;

 public class AccountDeposit extends Account {
        public AccountDeposit(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
            super(accountType, id, clientID, balance, withdrawAllowed);
        }
 }

