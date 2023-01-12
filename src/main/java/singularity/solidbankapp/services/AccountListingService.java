package singularity.solidbankapp.services;
import singularity.solidbankapp.domain.Account;
import singularity.solidbankapp.domain.AccountType;
import singularity.solidbankapp.domain.AccountWithdraw;

import java.util.List;
public interface AccountListingService {
        public Account getClientAccount(String clientID, String accountID);

        public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

        public List<Account> getClientAccounts(String clientID);

        public List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
