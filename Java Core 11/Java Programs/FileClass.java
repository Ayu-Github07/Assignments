import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) throws IOException{

        try{
            File file = new File("C:\\Users\\07ayu\\Documents\\Capgemini\\Java Core 11\\Java11Assignments_StudentList1.txt");
            System.out.println(file.length());
            Scanner sc = new Scanner(file);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Rest of the code will work");

    }
}
