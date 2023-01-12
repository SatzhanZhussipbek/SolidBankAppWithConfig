package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.Account;
import singularity.solidbankapp.domain.AccountType;
import singularity.solidbankapp.domain.AccountWithdraw;
import singularity.solidbankapp.repositories.AccountDAO;

import java.util.List;
    public class AccountListingServiceImpl implements AccountListingService {

        private AccountDAO accountDAO;

        public AccountListingServiceImpl(AccountDAO accountDAO) {
            this.accountDAO = accountDAO;
        }

        @Override
        public Account getClientAccount(String clientID, String accountID) {
        /*if (accountDAO.getClientAccounts(clientID).isEmpty()) {
            System.out.println("You don't have accounts.");
        }*/
            return accountDAO.getClientAccount(clientID, accountID);
        }

        @Override
        public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
            return null;
        }

        @Override
        public List<Account> getClientAccounts(String clientID) {
            return accountDAO.getClientAccounts(clientID);
        }

        @Override
        public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
            return accountDAO.getClientAccountsByType(clientID, accountType);
        }
    }

