package org.example.AssignmentQ4;


import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountServiceImp implements BankAccountService {

    @Autowired
    private BankAccount bankAccount1;

    @Autowired
    private BankAccount bankAccount2;

    public BankAccountServiceImp(){
    }

    public BankAccountServiceImp(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

    @Override
    public double withdraw(long accountId, double balance) {
        return 0;
    }

    @Override
    public double deposit(long accountId, double balance) {
        return 0;
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
    public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
        return false;
    }
}
