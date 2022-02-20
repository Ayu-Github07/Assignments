import java.util.ArrayList;
import java.util.Collections;

public class Assignment5Q3 {
    public static ArrayList traverseReverse(ArrayList aList){
        Collections.reverse(aList);
        return aList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(2);

        System.out.println("Printing Original Array: ");
        for (int i:arrayList){
            System.out.print(i+" ");
        }
        System.out.println("\nPrinting Reverse Array: ");
        arrayList = traverseReverse(arrayList);
        for (int i:arrayList){
            System.out.print(i+" ");
        }
    }
}
