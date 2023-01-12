package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.AccountDeposit;

public interface AccountDepositService {
    public void deposit(double amount, AccountDeposit account);
}
