package singularity.solidbankapp.clis;

import singularity.solidbankapp.domain.TransactionWithdraw;
import singularity.solidbankapp.services.AccountListingService;

public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;

    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;

    private AccountListingService accountListing;

    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw,
                                  WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI,
                                  AccountListingService accountListing) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListing;
    }

    public void withdrawMoney(String clientID) {

    }
}
