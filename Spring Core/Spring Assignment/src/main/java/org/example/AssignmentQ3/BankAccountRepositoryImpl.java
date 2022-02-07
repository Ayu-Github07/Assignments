package org.example.AssignmentQ3;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    private BankAccount bankAccount1;
    private BankAccount bankAccount2;

    public BankAccountRepositoryImpl() {
    }

    public BankAccountRepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

    @Override
    public double getBalance(long accountId) {
        if(this.bankAccount1.getAccountId()==accountId){
            return bankAccount1.getAccountBalance();
        }
        else {
            return bankAccount2.getAccountBalance();
        }
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        double updateBal = 0;
        if(this.bankAccount1.getAccountId()==accountId){
            updateBal = newBalance;
            bankAccount1.setAccountBalance(updateBal);
        }
        else {
            updateBal = newBalance;
            bankAccount2.setAccountBalance(updateBal);
        }
        return updateBal;
    }
}
