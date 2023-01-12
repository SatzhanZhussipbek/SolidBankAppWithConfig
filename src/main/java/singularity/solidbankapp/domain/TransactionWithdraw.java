package singularity.solidbankapp.domain;

import singularity.solidbankapp.repositories.TransactionDAO;
import singularity.solidbankapp.services.AccountWithdrawService;

public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;

    private TransactionDAO transactionDAO;

    public TransactionWithdraw(AccountWithdrawService accountWithdrawService,
                               TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    public void execute(AccountWithdraw accountWithdraw, double amount) {

    }

}
