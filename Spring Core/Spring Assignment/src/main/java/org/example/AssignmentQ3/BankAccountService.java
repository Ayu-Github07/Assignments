package org.example.AssignmentQ3;

public interface BankAccountService {
    public double withdraw(long accountId, double balance);
    public double deposit(long accountId, double balance);
    public double getBalance(long accountId);
    public boolean fundTransfer(long fromAccount, long toAccount, double amont);

}
