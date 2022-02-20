import java.util.Scanner;

public class Student {
    static int subjectA, subjectB, subjectC;

    static int studentsTotalMarksInAllSubjects(int[] marks) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += marks[i];
        }
        return sum;
    }

    static double studentsAverageMarksInAllSubjects(int[] marks) {
        int sum = studentsTotalMarksInAllSubjects(marks);
        int avg = sum / 3;
        return avg;
    }

    static int subjectATotalByStudents(int[] marks) {
        int sum = 0;
        for (int i = 0; i < 9; i += 3) {
            sum += marks[i];
        }
        return sum;
    }

    static int subjectBTotalByStudents(int[] marks) {
        int sum = 0;
        for (int i = 1; i < 9; i += 3) {
            sum += marks[i];
        }
        return sum;
    }

    static int subjectCTotalByStudents(int[] marks) {
        int sum = 0;
        for (int i = 2; i < 9; i += 3) {
            sum += marks[i];
        }
        return sum;
    }

    static double subjectAAverageByStudents(int[] marks) {
        int sum = subjectATotalByStudents(marks);

        double avg = sum / 3;
        return avg;
    }

    static double subjectBAverageByStudents(int[] marks) {
        int sum = subjectBTotalByStudents(marks);

        double avg = sum / 3;
        return avg;
    }

    static double subjectCAverageByStudents(int[] marks) {
        int sum = subjectCTotalByStudents(marks);

        double avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        int[] Student1 = new int[3];
        int[] Student2 = new int[3];
        int[] Student3 = new int[3];
        int[] marks = new int[9];

        int j = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks for student 1:");
            for (int i = 0; i <= 2; i++) {
                System.out.print("Subject : ");
                Student1[i] = sc.nextInt();
                marks[j] = Student1[i];
                j++;
            }
            System.out.println("\nEnter the marks for student 2:");
            for (int i = 0; i <= 2; i++) {
                System.out.print("Subject : ");
                Student2[i] = sc.nextInt();
                marks[j] = Student2[i];
                j++;
            }
            System.out.println("\nEnter the marks for student 3:");
            for (int i = 0; i <= 2; i++) {
                System.out.print("Subject : ");
                Student3[i] = sc.nextInt();
                marks[j] = Student3[i];
                j++;
            }

            System.out.println(
                    "Total marks of all the students in all subjects: " + studentsTotalMarksInAllSubjects(marks));

            System.out.println(
                    "Average marks of all the students in all subjects: " + studentsAverageMarksInAllSubjects(marks));

            System.out.println(
                    "Total marks scored by students in subject A: " + subjectATotalByStudents(marks));
            System.out.println(
                    "Average marks scored by students in subject A: " + subjectAAverageByStudents(marks));

            System.out.println(
                    "Total marks scored by students in subject B: " + subjectBTotalByStudents(marks));
            System.out.println(
                    "Average marks scored by students in subject B: " + subjectBAverageByStudents(marks));

            System.out.println(
                    "Total marks scored by students in subject C: " + subjectCTotalByStudents(marks));
            System.out.println(
                    "Average marks scored by students in subject C: " + subjectCAverageByStudents(marks));
        }

    }
}
