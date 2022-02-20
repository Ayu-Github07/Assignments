import java.util.Scanner;

public class SiCi {
    static double simpleInterest(double principalAmount, int time, double interestRate) {
        double SI = (principalAmount * time * interestRate) / 100;
        return SI;
    }

    static double compoundInterest(double principalAmount, int time, double interestRate) {
        double CI = (principalAmount * Math.pow((1 + interestRate / 100), time)) - principalAmount;

        return CI;
    }

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the principal amount: ");
            double principalAmount = sc.nextDouble();
            System.out.print("Enter the time: ");
            int time = sc.nextInt();
            System.out.print("Enter the interest rate: ");
            double interestRate = sc.nextDouble();

            System.out.println("Simple Interest: " + simpleInterest(principalAmount, time, interestRate));

            System.out.println("Compound Interest: " + compoundInterest(principalAmount, time, interestRate));
        }
    }
}