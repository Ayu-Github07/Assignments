import java.util.Locale;
import java.util.Scanner;

public class Assignment3Q2 {
    public static String ordinal(int i) {
        String[] suffixes = new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int price,total = 0;
        int choice;

        do{
            System.out.println("\t\t******************************\t\t");
            System.out.println("\t\t**  1) INSERT NEW PRICE     **\t\t");
            System.out.println("\t\t**  2) VIEW PURCHASE TOTAL  **\t\t");
            System.out.println("\t\t**  3) EXIT                 **\t\t");
            System.out.println("\t\t******************************\t\t");
            System.out.print("\t\tENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    String s = "Yes";
                    do{
                        System.out.print("\t\tInsert "+ordinal(count+1)+" price: ");
                        price = sc.nextInt();
                        total += price;
                        System.out.println("\t\tPrice has been saved to the file");
                        System.out.print("\t\tDo you want to enter price for more items? (Yes/No): ");
                        s = sc.next();
                        count++;
                        System.out.println();
                    }while(s.equalsIgnoreCase("Yes"));
                    break;
                case 2:
                    System.out.println("\t\tTotal Price of all items is: "+total);
                    break;
                case 3: System.exit(0);
                default : System.out.println("\t\tPLEASE ENTER THE CORRECT CHOICE!");
            }
        }while(choice!=3);

    }


}
