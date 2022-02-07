import java.util.Scanner;

abstract class DesertItem{
    abstract public int getCost();

}

class Candy extends DesertItem{
    public int cash;
    int addCandy;
    Candy(){
        addCandy = 0;
    }
    public void setAddCandy(int candy){
        this.addCandy += candy;
    }
    public int getAddCandy() {
        return addCandy;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public int getCost() {
        return cash*addCandy*60;
    }

    public void Order(int order){
        addCandy -= order;
    }

    public int TotalAmount(int order){
        return cash*order*60;
    }
}

class Cookie extends DesertItem{

    int addCookie;
    public int cash;
    public Cookie() {
        this.addCookie = 0;
    }

    public int getAddCookie() {
        return addCookie;
    }

    public void setAddCookie(int addCookie) {
        this.addCookie += addCookie;
    }

    public void setCash(int cash){
        this.cash = cash;
    }
    @Override
    public int getCost() {
        return cash*addCookie*70;
    }

    public void Order(int order){
        addCookie -= order;
    }

    public int TotalAmount(int order){
        return cash*order*70;
    }
}

class IceCream extends DesertItem{

    int addIceCream;
    public int cash;
    public IceCream() {
        addIceCream = 0;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getAddIceCream() {
        return addIceCream;
    }

    public void setAddIceCream(int addIceCream) {
        this.addIceCream += addIceCream;
    }

    @Override
    public int getCost() {
        return cash*addIceCream;
    }
    public void Order(int order){
        addIceCream -= order;
    }

    public int TotalAmount(int order){
        return cash*order;
    }
}
public class Assignment2Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        Candy candy = new Candy();
        Cookie cookie = new Cookie();
        IceCream iceCream = new IceCream();

        do {
            System.out.println("\t\t**********************************\t\t");
            System.out.println("\t\t**         SELECT ROLE          **\t\t");
            System.out.println("\t\t**********************************\t\t");
            System.out.println("\t\t**        1) OWNER              **\t\t");
            System.out.println("\t\t**        2) CUSTOMER           **\t\t");
            System.out.println("\t\t**        3) EXIT               **\t\t");
            System.out.println("\t\t**********************************\t\t");
            System.out.print("\t\tENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int desertitem;
                    System.out.println("\t\t*******************************\t\t");
                    System.out.println("\t\t**       ADD DESERTS         **\t\t");
                    System.out.println("\t\t*******************************\t\t");
                    System.out.println("\t\t**       1) ADD CANDY        **\t\t");
                    System.out.println("\t\t**       2) ADD COOKIE       **\t\t");
                    System.out.println("\t\t**       3) ADD ICE CREAM    **\t\t");
                    System.out.println("\t\t*******************************\t\t");
                    System.out.print("\t\tENTER YOUR CHOICE: ");
                    desertitem = sc.nextInt();
                    if (desertitem == 1) {
                        int m;
                        do {
                            System.out.println("\t\t***********************************\t\t");
                            System.out.println("\t\t 1. ENTER THE NUMBER OF CANDIES ");
                            System.out.println("\t\t 2. DISPLAY THE NUMBER OF CANDIES ");
                            System.out.println("\t\t 3. ENTER THE PRICE OF CANDIES ");
                            System.out.println("\t\t 4. DISPLAY THE PRICE OF CANDIES ");
                            System.out.println("\t\t 5. GO BACK");
                            System.out.println("\t\t***********************************\t\t");
                            System.out.print("\t\tENTER YOUR CHOICE: ");
                            m = sc.nextInt();
                            if (m == 1) {
                                int candies;
                                System.out.print("\t\tENTER THE NUMBER OF CANDIES: ");
                                candies = sc.nextInt();
                                candy.setAddCandy(candies);
                            } else if (m == 2) {
                                System.out.println("\t\tNUMBER OF CANDIES = " + candy.getAddCandy());
                            } else if (m == 3) {
                                int price;
                                System.out.print("\t\tENTER THE PRICE OF CANDIES (in Dollars): ");
                                price = sc.nextInt();
                                candy.setCash(price);
                            } else if(m==4){
                                System.out.println("\t\tPRICE OF CANDIES (in Rupees) = " + candy.getCost());
                            }
                            else{
                                break;
                            }
                        }while (m!=5);

                    } else if (desertitem == 2) {
                        int m;
                        do {
                            System.out.println("\t\t***********************************\t\t");
                            System.out.println("\t\t 1. ENTER THE NUMBER OF COOKIES ");
                            System.out.println("\t\t 2. DISPLAY THE NUMBER OF COOKIES ");
                            System.out.println("\t\t 3. ENTER THE PRICE OF COOKIES ");
                            System.out.println("\t\t 4. DISPLAY THE PRICE OF COOKIES ");
                            System.out.println("\t\t 5. GO BACK");
                            System.out.println("\t\t***********************************\t\t");
                            System.out.print("\t\tENTER YOUR CHOICE: ");
                            m = sc.nextInt();
                            if (m == 1) {
                                int cookies;
                                System.out.print("\t\tENTER THE NUMBER OF COOKIES: ");
                                cookies = sc.nextInt();
                                cookie.setAddCookie(cookies);
                            } else if (m == 2) {
                                System.out.println("\t\tNUMBER OF COOKIES = " + cookie.getAddCookie());
                            } else if (m == 3) {
                                int price;
                                System.out.print("\t\tENTER THE PRICE OF COOKIES (in Euros): ");
                                price = sc.nextInt();
                                cookie.setCash(price);
                            } else if(m==4){
                                System.out.println("\t\tPRICE OF COOKIES (in Rupees) = " + cookie.getCost());
                            }
                            else{
                                break;
                            }
                        }while (m!=5);

                    } else {
                        int m;
                        do{
                            System.out.println("\t\t***********************************\t\t");
                            System.out.println("\t\t 1. ENTER THE NUMBER OF ICE CREAM ");
                            System.out.println("\t\t 2. DISPLAY THE NUMBER OF ICE CREAM ");
                            System.out.println("\t\t 3. ENTER THE PRICE OF ICE CREAM ");
                            System.out.println("\t\t 4. DISPLAY THE PRICE OF ICE CREAM ");
                            System.out.println("\t\t 5. GO BACK");
                            System.out.println("\t\t***********************************\t\t");
                            System.out.print("\t\tENTER YOUR CHOICE: ");
                            m = sc.nextInt();
                            if (m == 1) {
                                int icecreams;
                                System.out.print("\t\tENTER THE NUMBER OF ICE CREAM: ");
                                icecreams = sc.nextInt();
                                iceCream.setAddIceCream(icecreams);
                            } else if (m == 2) {
                                System.out.println("\t\tNUMBER OF ICE CREAM = " + iceCream.getAddIceCream());
                            } else if (m == 3) {
                                int price;
                                System.out.print("\t\tENTER THE PRICE OF ICE CREAM (in Rupees): ");
                                price = sc.nextInt();
                                iceCream.setCash(price);
                            } else if(m==4){
                                System.out.println("\t\tPRICE OF ICE CREAM (in Rupees) = " + iceCream.getCost());
                            }
                            else{
                                break;
                            }
                        }while(m!=5);

                    }
                    break;
                case 2:
                    int order;
                    System.out.println("\t\t*******************************\t\t");
                    System.out.println("\t\t**       SELECT DESERT       **\t\t");
                    System.out.println("\t\t*******************************\t\t");
                    System.out.println("\t\t**       1) CANDY            **\t\t");
                    System.out.println("\t\t**       2) COOKIE           **\t\t");
                    System.out.println("\t\t**       3) ICE CREAM        **\t\t");
                    System.out.println("\t\t*******************************\t\t");
                    System.out.print("\t\tENTER YOUR CHOICE: ");
                    order = sc.nextInt();
                    if(order == 1){
                        int qty;
                        System.out.print("\t\t ENTER THE QUANTITY YOU WANT TO PURCHASE: ");
                        qty = sc.nextInt();
                        candy.Order(qty);
                        System.out.println("\t\t ORDER RECEIPT: ");
                        System.out.println("\t\t QUANTITY ORDER = "+qty);
                        System.out.println("\t\t TOTAL AMOUNT (in Rupees) = "+candy.TotalAmount(qty));
                    }
                    else if(order==2){
                        int qty;
                        System.out.print("\t\t ENTER THE QUANTITY YOU WANT TO PURCHASE: ");
                        qty = sc.nextInt();
                        cookie.Order(qty);
                        System.out.println("\t\t ORDER RECEIPT: ");
                        System.out.println("\t\t QUANTITY ORDER = "+qty);
                        System.out.println("\t\t TOTAL AMOUNT (in Rupees) = "+cookie.TotalAmount(qty));
                    }
                    else{
                        int qty;
                        System.out.print("\t\t ENTER THE QUANTITY YOU WANT TO PURCHASE: ");
                        qty = sc.nextInt();
                        iceCream.Order(qty);
                        System.out.println("\t\t ORDER RECEIPT: ");
                        System.out.println("\t\t QUANTITY ORDER = "+qty);
                        System.out.println("\t\t TOTAL AMOUNT (in Rupees) = "+iceCream.TotalAmount(qty));
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\t PLEASE ENTER THE CORRECT CHOICE!!!");

            }
        }while (choice != 3) ;

    }
}
