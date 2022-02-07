import java.io.*;
import java.util.Scanner;

public class Assignment3Q1 {
    public static void main(String[] args) throws IOException {
        // File path is passed as parameter
        File file = new File("C:\\Users\\07ayu\\Documents\\Capgemini\\Java Core 11\\Java11Assignments_StudentList.txt");

        Scanner sc = new Scanner(file);

        int count = 0;
        while (sc.hasNextLine()){
            String string = sc.nextLine();

            if(string.length()!=0){
                System.out.println(string.trim());
                count++;
            }
        }
        System.out.println("Total number of students present in the txt file are: "+count);

        sc.close();
    }
}

