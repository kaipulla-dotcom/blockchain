package com.kaipulla.blockchain;

import java.util.List;

public class Block {

    private int hash;
    private List<Transaction> transactions;

    public Block(int hash, List<Transaction> transactions) {
        this.hash = hash;
        this.transactions = transactions;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {
        int result = hash;
        result = 31 * result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
