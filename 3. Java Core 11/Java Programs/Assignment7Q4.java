//1. Find all transactions in the year 2011 and sort them by value (small to high).
//2. Print all transactions’ values from the traders living in Delhi.
//3. What’s the highest value of all the transactions?
//4. Find the transaction with the smallest value.


import java.util.*;
import java.util.stream.Collectors;

class Trader1 {
    String name;
    String city;

    public Trader1(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Trader1(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader1)) return false;
        Trader1 trader1 = (Trader1) o;
        return name.equals(trader1.name) && city.equals(trader1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}

class Transaction {
    Trader1 trader1;
    int year;
    int value;

    public Transaction(){}
    public Transaction(Trader1 trader1, int year, int value) {
        this.trader1 = trader1;
        this.year = year;
        this.value = value;
    }

    public Trader1 getTrader1() {
        return trader1;
    }

    public void setTrader1(Trader1 trader1) {
        this.trader1 = trader1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return year == that.year && value == that.value && trader1.equals(that.trader1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader1, year, value);
    }

    public static Comparator<Transaction> MaximumValue = new Comparator<Transaction>() {
        @Override
        public int compare(Transaction o1, Transaction o2) {
            return o1.getValue()-o2.getValue();
        }
    };
}
public class Assignment7Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {

        transactions = transactions.stream().filter((t1)->t1.getYear()==2011).collect(Collectors.toList());

        transactions.sort(Transaction.MaximumValue);
        return transactions;

    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Integer> transactionValue = new ArrayList<>();

        transactions = transactions.stream().filter((t1)->t1.getTrader1().getCity().toUpperCase().equals("DELHI")).collect(Collectors.toList());

        for(Transaction t1: transactions){
            transactionValue.add(t1.getValue());
        }
        return transactionValue;
    }
    public static int highestTransaction(List<Transaction> transactions){
       int MaxTransaction;
       MaxTransaction = transactions.stream().mapToInt(Transaction::getValue).max().orElseThrow(NoSuchElementException::new);
       return MaxTransaction;
    }

    public static int smallestTransaction(List<Transaction> transactions){
       return transactions.stream().mapToInt(Transaction::getValue).min().orElseThrow(NoSuchElementException::new);
    }
    public static void main(String[] args) {
        List<Transaction> arraylist = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1. ENTER THE DETAILS OF TRADERS & THEIR TRANSACTIONS");
            System.out.println("2. DISPLAY THE DETAILS OF TRADERS & THEIR TRANSACTION");
            System.out.println("3. DISPLAY ALL TRANSACTIONS IN THE YEAR 2011 IN SORTED ORDER");
            System.out.println("4. DISPLAY ALL TRANSACTIONS FROM TRADERS WHO LIVES IN DELHI");
            System.out.println("5. DISPLAY THE HIGHEST VALUE OF ALL THE TRANSACTIONS");
            System.out.println("6. DISPLAY THE SMALLEST VALUE OF ALL THE TRANSACTIONS");
            System.out.println("7. EXIT");
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Transaction transaction = new Transaction();
                    Trader1 trader1 = new Trader1();
                    sc.nextLine();
                    System.out.print("ENTER THE NAME OF THE TRADER: ");
                    String name = sc.nextLine();
                    trader1.setName(name);

                    System.out.print("ENTER THE CITY NAME OF THE TRADER: ");
                    String city = sc.nextLine();
                    trader1.setCity(city);

                    transaction.setTrader1(trader1);

                    System.out.print("ENTER THE YEAR OF TRANSACTION: ");
                    int year = sc.nextInt();
                    transaction.setYear(year);

                    System.out.print("ENTER THE AMOUNT OF TRANSACTION: ");
                    int amount = sc.nextInt();
                    transaction.setValue(amount);

                    arraylist.add(transaction);
                    break;

                case 2:
                    System.out.println("List of all Traders and their Transactions");

                    for (Transaction t: arraylist){
                        System.out.println("Trader Name: "+t.getTrader1().getName());
                        System.out.println("Trader City: "+t.getTrader1().getCity());
                        System.out.println("Year:        "+t.getYear());
                        System.out.println("Value:       "+t.getValue());
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("All the transactions in the year 2011 in sorted order: ");
                    List<Transaction> transactionList = new ArrayList<>();
                    transactionList = sortTransactions(arraylist);

                    for (Transaction t1: transactionList){
                        System.out.println("Trader Name: "+t1.getTrader1().getName());
                        System.out.println("Trader City: "+t1.getTrader1().getCity());
                        System.out.println("Value: "+t1.getValue());
                        System.out.println("Year: "+t1.getYear());
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("All transactions from the traders lives in Delhi: ");
                    List<Integer> list = new ArrayList<>();
                    list = transactionsValuesDelhi(arraylist);

                    list.forEach(System.out::println);
                    break;

                case 5: int Maxvalue = highestTransaction(arraylist);
                    System.out.println("Highest Transaction value: "+Maxvalue);
                    break;

                case 6: int Minvalue = smallestTransaction(arraylist);
                    System.out.println("Lowest Transaction value: "+Minvalue);
                    break;

                case 7: System.exit(0);

                default:
                    System.out.println("PLEASE ENTER THE CORRECT CHOICE: ");

            }
        }while (choice!=7);


    }
}
