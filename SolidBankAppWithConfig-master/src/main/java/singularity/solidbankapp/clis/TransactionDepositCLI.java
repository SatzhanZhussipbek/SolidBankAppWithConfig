package singularity.solidbankapp.clis;

import singularity.solidbankapp.domain.TransactionDeposit;
import singularity.solidbankapp.services.AccountListingService;

public class TransactionDepositCLI {
    private TransactionDeposit transactionDeposit;

    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;

    private AccountListingService accountListing;

    public TransactionDepositCLI(TransactionDeposit transactionDeposit,
                                 WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI,
                                 AccountListingService accountListing) {
        this.transactionDeposit = transactionDeposit;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListing;
    }

    public void depositMoney(String ClientID) {

    }




}
