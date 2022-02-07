public class ArmstrongNumBetweenRange {
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
        int min = 100;
        int max = 999;

        for (int i = min; i <= max; i++) {
            if (armstrongCheck(i) == true) {
                System.out.print(i + " ");
            }
        }

    }
}
