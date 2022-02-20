
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name = "+this.name+"| Height = "+this.height+"| Weight = "+this.weight;
    }
}
class HeightComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.weight>o2.weight){
            return -1;
        }
        else if(o1.weight<o2.weight){
            return 1;
        }
        else {
            return Double.compare(o2.height, o1.height);
        }
    }
}
public class Assignment5Q1 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new HeightComparator());
        set.add(new Person("Ayush Agrawal",165,70.5));
        set.add(new Person("Ritik Dixit",167,63.8));
        set.add(new Person("Pratik Nandurkar",172,80.9));
        set.add(new Person("Ujjwal Kohli",162,50.5));
        set.add(new Person("Harsh Vardhan Singh",170,50.5));
        set.add(new Person("Atharva Upadhye",162,51.5));
        set.add(new Person("Aryan Dewangan",162,53.5));

        System.out.println("Printing in the sorted order based upon weight first, if the weights are equal then based upon height:");
        for (Person person: set){
            System.out.println(person);
        }
    }
}
