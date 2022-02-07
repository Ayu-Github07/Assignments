import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class Assignment5Q8B {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 8)

                list.add(14);
        }
    }
}
