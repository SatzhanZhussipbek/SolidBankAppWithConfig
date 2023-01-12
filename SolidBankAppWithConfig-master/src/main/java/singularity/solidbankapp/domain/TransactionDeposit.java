package singularity.solidbankapp.domain;
import singularity.solidbankapp.repositories.TransactionDAO;
import singularity.solidbankapp.services.AccountDepositService;

public class TransactionDeposit {
    private AccountDepositService accountDepositService;

    private TransactionDAO transactionDAO;

    public TransactionDeposit(AccountDepositService accountDepositService,
                              TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    public void execute(AccountDeposit accountDeposit, double amount) {

    }
}
