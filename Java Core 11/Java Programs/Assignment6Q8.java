import java.util.Arrays;
import java.util.List;

class Thread extends java.lang.Thread{
    public void Display_Numbers(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
    }
}

public class Assignment6Q8 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Printing numbers from the list: ");
        thread.Display_Numbers(list);

        thread.stop();
    }
}
