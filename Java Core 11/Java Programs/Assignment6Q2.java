import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6Q2 {

    interface listOfOrders{
        public ArrayList<String> Result(int totalPrice, String status);
    }

    public static listOfOrders orders(){
        return (totalPrice,status)->{
            ArrayList<String> result= new ArrayList<>();
            if(totalPrice>=10000){
                result.add("order price more than 10000");
            }
            else{
                result.add("order price less than 10000");
            }
            result.add(status);
            return result;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order price: ");
        int price = sc.nextInt();
        System.out.println("Enter the order status: ");
        String status = sc.next();

        ArrayList<String> result;
        result = orders().Result(price,status);

        System.out.println("ORDER STATUS: ");
        for (String i: result){
            System.out.println(i);
        }
    }
}
