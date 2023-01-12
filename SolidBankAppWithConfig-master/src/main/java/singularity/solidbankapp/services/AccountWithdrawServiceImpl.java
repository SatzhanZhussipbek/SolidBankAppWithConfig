package singularity.solidbankapp.services;
import singularity.solidbankapp.domain.AccountWithdraw;
import singularity.solidbankapp.repositories.AccountDAO;

public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    private AccountDAO accountDAO;

    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
    @Override
    public void withdraw(double amount, AccountWithdraw account) {

    }
}
