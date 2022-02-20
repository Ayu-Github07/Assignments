import java.util.Scanner;

public class Assignment6Q1 {
    interface addition{
        double add(int num1,int num2);
    }
    interface subtraction{
        double sub(int num1,int num2);
    }
    interface multiplication{
        double mul(int num1,int num2);
    }

    interface division{
        double div(int num1,int num2);
    }

    public static addition getAddition(){
        return (num1,num2)->{return num1+num2;};
    }

    public  static  subtraction getSubtraction(){
        return (num1,num2)->{return num1-num2;};
    }
    public static multiplication getMultiplication(){
        return (num1,num2)->{return num1*num2;};
    }
    public static division getDivision(){
        try{
            return (num1,num2)->{return num1/num2;};
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int a = sc.nextInt();
        System.out.println("Enter the num2: ");
        int b = sc.nextInt();

        System.out.println("Addition = "+getAddition().add(a,b));
        System.out.println("Subtraction = "+getSubtraction().sub(a,b));
        System.out.println("Multiplication = "+getMultiplication().mul(a,b));
        System.out.println("Division = "+getDivision().div(a,b));
    }
}
