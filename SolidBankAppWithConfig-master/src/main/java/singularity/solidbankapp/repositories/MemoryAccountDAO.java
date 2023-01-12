package singularity.solidbankapp.repositories;

import singularity.solidbankapp.domain.Account;
import singularity.solidbankapp.domain.AccountType;
import singularity.solidbankapp.domain.AccountWithdraw;

import java.util.ArrayList;
import java.util.List;
public class MemoryAccountDAO implements AccountDAO{

        private List<Account> accountList = new ArrayList<>();

        @Override
        public List<Account> getClientAccounts(String clientID) {
            return accountList;
        }

        @Override
        public void createNewAccount(Account account) {
            this.accountList.add(account);
            System.out.println("The bank account has been created");
        }

        @Override
        public void updateAccount(Account account) {

        }

        @Override
        public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
            return null;
        }

        @Override
        public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
            return null;
        }

        @Override
        public Account getClientAccount(String clientID, String accountID) {
            return null;
        }
    }


