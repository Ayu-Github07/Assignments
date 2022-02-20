import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class employee{
    String name;
    int id;
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id = "+this.id+"  Name = "+this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employee)) return false;
        employee employee = (employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class Assignment5Q5 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        employee e1 = new employee(1,"Ayush Agrawal");
        employee e2 = new employee(1,"Aditya Singh");
        employee e3 = new employee(3,"Ritik Dixit");
        employee e4 = new employee(3,"Pratik Nandurkar");
        employee e5 = new employee(2,"Atharva Upadhye");

        map.put(e1.getId(), e1.getName());
        map.put(e2.getId(), e2.getName());
        map.put(e3.getId(), e3.getName());
        map.put(e4.getId(), e4.getName());
        map.put(e5.getId(), e5.getName());

        System.out.println("Key-Value pair in map: ");
        for (Map.Entry<Integer,String> m:map.entrySet()){
            int key = m.getKey();
            String  value = m.getValue();
            System.out.println(key+" : "+value);
        }
    }
}
