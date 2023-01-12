package singularity.solidbankapp.services;

import singularity.solidbankapp.domain.AccountType;

public interface AccountCreationService {
    public void create(AccountType accountType, long bankID, String clientID, long accountID);
}
