package org.example.AssignmentQ3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class BankAccountController implements ApplicationContextAware {
   private ApplicationContext context;

    public double withdraw(long accountId, double balance){
        double newBalance = 0;
        BankAccountRepositoryImpl accountRepository = (BankAccountRepositoryImpl) context.getBean("BankRepo");
        
        if(accountRepository.getBalance(accountId)>=balance){
            newBalance = accountRepository.getBalance(accountId)-balance;
            accountRepository.updateBalance(accountId,newBalance);
        }
        return newBalance;
    }
    public double deposit(long accountId, double balance){
        BankAccountRepositoryImpl bankAccountRepository = context.getBean("BankRepo",BankAccountRepositoryImpl.class);
        double newBalance = bankAccountRepository.getBalance(accountId)+balance;
        return bankAccountRepository.updateBalance(accountId,newBalance);
    }
    public double getBalance(long accountId){
        BankAccountRepositoryImpl bankAccountRepository = (BankAccountRepositoryImpl) context.getBean("BankRepo");
        return bankAccountRepository.getBalance(accountId);
    }
    public boolean fundTransfer(long fromAccount, long toAccount, double amont){
       BankAccountRepositoryImpl accountRepository = (BankAccountRepositoryImpl) context.getBean("BankRepo");
        if(accountRepository.getBalance(fromAccount)>=amont){
            double updateAmt = amont+accountRepository.getBalance(toAccount);

            accountRepository.updateBalance(fromAccount,accountRepository.getBalance(fromAccount)-amont);
            accountRepository.updateBalance(toAccount,accountRepository.getBalance(toAccount)+amont);
            return true;
        }
        return false;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
