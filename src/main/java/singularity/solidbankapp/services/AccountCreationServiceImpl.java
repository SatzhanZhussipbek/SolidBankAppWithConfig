package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.*;
import singularity.solidbankapp.repositories.AccountDAO;
import singularity.solidbankapp.services.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {

    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = null;
        if (accountType.toString().equals("CHECKING") ) {
            account = new CheckingAccount(accountType, accountID, clientID, 0.0, true);
        }
        else if (accountType.toString().equals("SAVING") ) {
            account = new SavingAccount(accountType, accountID, clientID, 0.0, true);
        }
        else if (accountType.toString().equals("FIXED")){
            account = new FixedAccount(accountType, accountID, clientID, 0.0, false);
        }
        this.accountDAO.createNewAccount(account);
    }
}

