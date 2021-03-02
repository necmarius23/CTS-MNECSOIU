package ro.ase.csie.cts.g1094.models;

public abstract  class BankAccount extends Account {
    protected double balance;
    protected String iban;

    public BankAccount(double balance, String iban) {
        this.balance = balance;
        this.iban = iban;
    }

    @Override
    public Object getBalance() {
        return this.balance;
    }
}
