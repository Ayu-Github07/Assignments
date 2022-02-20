interface SimpleInterest{
    public double Si(int principal,int time,double rate);
}

public class Assignment4Q1 {
    public static void main(String[] args) {

        SimpleInterest simpleInterest = ((principal, time, rate) -> (principal*time*rate)/100 );

        System.out.println("Simple Interest\nPrincipal = 1000\nRate of interest = 6.5\nTime = 4");
        System.out.println("Simple interest = "+simpleInterest.Si(1000,4,6.5));

        //not required
        double amount = 1000+simpleInterest.Si(1000,4,6.5);
        System.out.println("Total Amount = "+amount);
    }
}
