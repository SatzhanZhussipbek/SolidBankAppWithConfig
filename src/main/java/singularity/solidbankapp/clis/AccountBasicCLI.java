package singularity.solidbankapp.clis;

import singularity.solidbankapp.domain.Account;
import singularity.solidbankapp.domain.AccountType;
import singularity.solidbankapp.repositories.BankCore;
import singularity.solidbankapp.services.AccountListingService;

import java.util.List;

public class AccountBasicCLI {

    private CreateAccountOperationUI createAccountOperationUI;

    private BankCore bankCore;

    private AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI,
                           BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(String clientID) {
        AccountType accountType = createAccountOperationUI.requestAccountType();
        if (accountType==null) {
            return;
        }
        System.out.println("Error in the account name.");
    }

    public void getAccounts(String clientID) {
        List<Account> listOfAccounts = accountListing.getClientAccounts(clientID);
        System.out.println(listOfAccounts);
    }
}
