import java.util.Scanner;

public class ResultDeclaration {
    static String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        if (subject1Marks >= 60.0 && subject2Marks >= 60.0 && subject3Marks >= 60.0) {
            return "passed";
        } else if ((subject1Marks >= 60.0 && subject2Marks >= 60.0 && subject3Marks < 60.0)
                || (subject1Marks >= 60.0 && subject2Marks < 60.0 && subject3Marks >= 60.0)
                || (subject1Marks < 60.0 && subject2Marks >= 60.0 && subject3Marks >= 60.0)) {
            return "promoted";
        } else {
            return "failed";
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double subject1Marks = sc.nextDouble();
            double subject2Marks = sc.nextDouble();
            double subject3Marks = sc.nextDouble();

            System.out.println(declareResults(subject1Marks, subject2Marks, subject3Marks));
        }

    }

}
