import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBankAccount {
    private BankAccount bankAccount;
    private long withDrawAmount;
    @BeforeEach
    public void init(){
        //Initialize the Bank Amount;
       bankAccount = new BankAccount(50000);
    }

    @Test
    public void testBankAccount(){
        withDrawAmount = 40000;
        Assertions.assertThrows(InsufficientFundsExpcetion.class,()->{
            System.out.println(bankAccount.withDraw(withDrawAmount));
        },"YOU HAVE INSUFFICIENT BALANCE!!!");

    }

    @Test
    public void testBankAccount1(){
        withDrawAmount = 20000;
        Assertions.assertDoesNotThrow(()->{
            System.out.println("BALANCE AFTER WITHDRAWAL : "+bankAccount.withDraw(withDrawAmount));
        });
    }
}
