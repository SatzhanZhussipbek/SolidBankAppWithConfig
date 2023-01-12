package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.AccountWithdraw;

public interface AccountWithdrawService {
    public void withdraw(double amount, AccountWithdraw account);
}
