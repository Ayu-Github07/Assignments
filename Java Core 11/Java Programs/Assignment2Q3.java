class Bank{
    public int getCash(int cash){
        return cash;
    }
}
class SavingAccount extends Bank{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    @Override
    public int getCash(int cash) {
        return totalDeposits+cash;
    }

    public int getTotalDeposits() {
        return totalDeposits;
    }

    public int getFixedDepositAmount() {
        return fixedDepositAmount;
    }
}

class CreditAccount extends Bank{
    int totalDeposits = 10000;
    int cashCredit = 2000;

    @Override
    public int getCash(int cash){
        return totalDeposits + cash;
    }

    public int getTotalDeposits() {
        return totalDeposits;
    }

    public int getCashCredit() {
        return cashCredit;
    }
}

public class Assignment2Q3 {
    public static void main(String[] args) {
        //Creating an instance for the credit account class.
        CreditAccount credit = new CreditAccount();

        //Creating an instance for the saving account class.
        SavingAccount saving = new SavingAccount();

        int cash = 10000;
        System.out.println("Minimum cash limit in credit account: "+credit.getCashCredit());
        System.out.println("Fixed deposit amount in saving account: "+saving.getFixedDepositAmount());

        System.out.println("Cash Deposited in credit account: "+credit.getTotalDeposits());
        System.out.println("Cash Deposited in saving account: "+saving.getTotalDeposits());

        System.out.println("Amount after depositing cash in credit account: "+credit.getCash(cash));
        System.out.println("Amount after depositing cash in saving account: "+saving.getCash(cash));

    }
}
