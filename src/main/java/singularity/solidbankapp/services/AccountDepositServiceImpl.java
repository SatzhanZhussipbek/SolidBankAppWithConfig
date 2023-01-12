package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.AccountDeposit;
import singularity.solidbankapp.repositories.AccountDAO;

public class AccountDepositServiceImpl implements AccountDepositService{

    private AccountDAO accountDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void deposit(double amount, AccountDeposit account) {

    }


}
