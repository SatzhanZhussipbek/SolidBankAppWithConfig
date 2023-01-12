package singularity.solidbankapp.repositories;

import singularity.solidbankapp.domain.Transaction;

import java.util.List;

public class MemoryTransactionDAO implements TransactionDAO {

    private List<Transaction> transactions;
    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransactions(Transaction transaction) {

    }
}
