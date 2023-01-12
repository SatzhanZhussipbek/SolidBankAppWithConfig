package singularity.solidbankapp.domain;

 public class AccountWithdraw extends Account {
        public AccountWithdraw(AccountType accountType, long id, String clientID, double balance, boolean withdrawAllowed) {
            super(accountType, id, clientID, balance, withdrawAllowed);
        }
 }

