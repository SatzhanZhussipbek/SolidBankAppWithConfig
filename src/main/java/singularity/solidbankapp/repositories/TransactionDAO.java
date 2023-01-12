package singularity.solidbankapp.repositories;

import singularity.solidbankapp.domain.Transaction;

import java.util.List;

public interface TransactionDAO {
    public List<Transaction> getTransactions();

    public void addTransactions(Transaction transaction);


}
