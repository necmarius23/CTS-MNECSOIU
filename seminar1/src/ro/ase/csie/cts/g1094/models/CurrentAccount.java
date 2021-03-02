package ro.ase.csie.cts.g1094.models;

import ro.ase.csie.cts.g1094.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

    public static final double MAX_CREDIT = 500;

    public CurrentAccount(double balance, String iban) {
        super(CurrentAccount.MAX_CREDIT, iban);
    }

    @Override
    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(Double amount) throws InsufficientFundsException {
        if(amount > this.balance){
            throw new InsufficientFundsException("You don t have the required amount");
        }else{
            this.balance += amount;
        }
    }

    @Override
    public void transfer(Account destination, Double amount)
            throws InsufficientFundsException, IllegalTransferException {
        if(this == destination) {
            throw  new IllegalTransferException();
        }
            this.withdraw(amount);
            destination.deposit(amount);

    }
}
