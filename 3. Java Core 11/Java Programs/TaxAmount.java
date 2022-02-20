import java.util.Scanner;

public class TaxAmount {

    static double calculateTaxAmount(int ctc) {
        double amount;
        if (ctc <= 180000) {
            amount = ctc;
        } else if (ctc > 1800000 && ctc <= 300000) {
            amount = ctc - ctc * 0.1;
        } else if (ctc > 300000 && ctc <= 500000) {
            amount = ctc - ctc * 0.2;
        } else {
            amount = ctc - ctc * 0.3;
        }
        return amount;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int income = sc.nextInt();

            double amount = calculateTaxAmount(income);

            System.out.println("Taxable amount : " + amount);
        }
    }

}
