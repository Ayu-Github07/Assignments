import java.util.Scanner;

public class ArmstrongOrNot {
    static boolean armstrongCheck(int num) {

        int new_num = num;
        int ans = 0, d;
        while (new_num != 0) {
            d = new_num % 10;
            ans += d * d * d;
            new_num /= 10;
        }

        if (ans == num) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;

            // System.out.println("Enter the number: ");
            num = sc.nextInt();

            boolean ans = armstrongCheck(num);

            if (ans == true) {

                System.out.println("Armstrong number!!");
            } else {
                System.out.println("Not Armstrong number!!");
            }
        }

    }
}