import java.util.*;

class savingaccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    public void withDraw(double amount){
        if(this.acc_balance<amount){
            System.out.println("YOUR ACCOUNT HAS INSUFFICIENT BALANCE");
        }
        else{
            this.acc_balance-=amount;
            System.out.println("MONEY WITHDRAWN SUCCESSFULLY");
            System.out.println("ACCOUNT BALANCE = "+this.acc_balance);
        }
    }
    public void Deposit(double amount){
        this.acc_balance += amount;
        System.out.println("MONEY ADDED SUCCESSFULLY");
        System.out.println("ACCOUNT BALANCE = "+this.acc_balance);
    }
}
class accountComparator implements Comparator<savingaccount>{

    @Override
    public int compare(savingaccount o1, savingaccount o2) {
        if(o1.getAcc_ID()>o2.getAcc_ID()){
            return -1;
        }
        else if(o1.getAcc_ID()<o2.getAcc_ID()){
            return 1;
        }
        else {
            return 0;
        }
    }
}


class BankAccountList{

    TreeSet<savingaccount> savingAccounts = new TreeSet<>(new accountComparator());

    public boolean addSavingAccount(savingaccount savingAccount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Id: ");
        savingAccount.setAcc_ID(sc.nextInt());

        System.out.println("Enter the Account holder name: ");
        savingAccount.setAccountHolderName(sc.next());

        System.out.println("Enter the Account Balance: ");
        savingAccount.setAcc_balance(sc.nextDouble());

        System.out.println("Is Saving Account (Yes/No): ");
        String accountType =  sc.next();
        if(accountType.toUpperCase().equals("YES")){
            savingAccount.setSalaryAccount(true);
        }
        else{
            savingAccount.setSalaryAccount(false);
        }

        savingAccounts.add(savingAccount);
        System.out.println("ACCOUNT REGISTERED SUCCESSFULLY");
        return true;
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> id = new ArrayList<>();

        for(savingaccount savingaccount: savingAccounts){
            id.add(savingaccount.getAcc_ID());
        }
        return id;
    }
}


public class Assignment5Q9 {
    public static void main(String[] args) {
        BankAccountList bankAccountList = new BankAccountList();
        savingaccount savingaccount = new savingaccount();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. ADD THE SAVING ACCOUNT");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. DISPLAY THE SAVING ACCOUNT IDs");
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();
            switch (choice){
                case 1: bankAccountList.addSavingAccount(savingaccount);
                    break;

                case 2:double amount;
                    System.out.println("Enter the amount to be deposit: ");
                    amount = sc.nextDouble();
                    savingaccount.Deposit(amount);
                    break;
                case 3:
                    double amount1;
                    System.out.println("Enter the amount to be withdraw: ");
                    amount1 = sc.nextDouble();
                    savingaccount.withDraw(amount1);
                    break;
                case 4: List<Integer> id = new ArrayList<>();
                    id = bankAccountList.displaySavingAccountIds();
                    System.out.println("Account Id: ");
                    for(Integer i: id){
                        System.out.println(i);
                    }
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("PLEASE ENTER THE VALID OPTION!");

            }
        }while (choice!=5);
    }
}
