import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment6Q4 {
    interface RemoveOddLenght{
        public ArrayList<String> removeOddLenght(ArrayList<String> Employee);
    }

    public static RemoveOddLenght removeOddLenght(){
        return (Employee)->{
            for(String i: Employee){

                if(i.length()%2!=0){
                    Employee.remove(i);
                }
            }
            return Employee;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter the numbers of strings to be inserted: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter the string: ");
            String str = sc.next();
            list.add(str);
        }
        System.out.println("List before removing odd length words: ");
        for(String i: list){
            System.out.print(i+" ");
        }
        System.out.println();

        list = removeOddLenght().removeOddLenght(list);

        System.out.println("List after removing odd length words: ");
        for(String i: list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
