package com.kaipulla.blockchain;

public class Transaction {
    private String source;
    private String destination;
    private Double amount;

    public Transaction(String source, String destination, Double amount) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
