package singularity.solidbankapp.repositories;

import singularity.solidbankapp.domain.Account;
import singularity.solidbankapp.domain.AccountType;
import singularity.solidbankapp.domain.AccountWithdraw;

import java.util.List;

public interface AccountDAO {
    public List<Account> getClientAccounts(String clientID);

    public void createNewAccount(Account account);

    public void updateAccount(Account account);

    public List<Account> getClientAccountsByType(String clientID, AccountType accountType);

    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    public Account getClientAccount(String clientID, String accountID);
}
