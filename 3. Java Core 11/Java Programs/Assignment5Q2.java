import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment5Q2 {
    public static HashSet<Integer> unordered(HashSet<Integer> hashSet){
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(2);

        return hashSet;
    }
    public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet){
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        return linkedHashSet;
    }
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        hashSet = unordered((HashSet<Integer>) hashSet);
        linkedHashSet = ordered((LinkedHashSet<Integer>) linkedHashSet);



        System.out.println("Elements in HashSet: ");
        for(Object i:hashSet){
            System.out.print(i+" ");
        }
        System.out.println("\nSee in HashSet the order in which the elements are inserted is not maintained ");


        System.out.println("\nElements in LinkedHashSet: ");
        for(int i:linkedHashSet){
            System.out.print(i+" ");
        }
        System.out.println("\nSee in LinkedHashSet the order in which the elements are inserted is maintained ");
    }
}
