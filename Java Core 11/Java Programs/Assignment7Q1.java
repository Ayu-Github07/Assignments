//1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
//2. Display color wise list of fruit names.
// 3. Display only RED color fruits sorted as per their price in ascending order.


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Fruits {
    String name;
    int calories;
    int price;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruits)) return false;
        Fruits fruits = (Fruits) o;
        return calories == fruits.calories && price == fruits.price && color.equals(fruits.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, price, color);
    }

    public static Comparator<Fruits> color1 = new Comparator<Fruits>() {
        @Override
        public int compare(Fruits o1, Fruits o2) {
           return o1.getColor().compareTo(o2.getColor());
        }
    };

    public static Comparator<Fruits> calories1 = new Comparator<Fruits>() {
      public int compare(Fruits f1,Fruits f2){
          return f2.getCalories()-f1.getCalories();
      }
    };

    public static Comparator<Fruits> price1 = new Comparator<Fruits>() {
        @Override
        public int compare(Fruits o1, Fruits o2) {
            return o1.getPrice()-o2.getPrice();
        }
    };
}


public class Assignment7Q1 {


    public static List<String> reverseSort(ArrayList<Fruits> fruits) {
        List<String> list = new ArrayList<>();
        ArrayList<Fruits> fruits2 = new ArrayList<>();

        fruits2 = (ArrayList<Fruits>) fruits.stream().filter((fruits1 -> {return fruits1.getCalories()<100;})).collect(Collectors.toList());

        Collections.sort(fruits2,Fruits.calories1);

        for(Fruits f: fruits2){
            String string = f.getName();
            list.add(string);
        }

        return list;
    }
    public static ArrayList<Fruits> sort(ArrayList<Fruits> fruits) {
        Collections.sort(fruits,Fruits.color1);
        return fruits;
    }

    public static ArrayList<Fruits> filterRedSortPrice(ArrayList<Fruits> fruits){
        fruits = (ArrayList<Fruits>) fruits.stream().filter((fruits1 -> {return fruits1.getColor().toUpperCase().equals("RED");})).collect(Collectors.toList());
        Collections.sort(fruits,Fruits.price1);
        return fruits;
    }

    public static void main(String[] args) {

        ArrayList<Fruits> arrayList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1. ENTER THE FRUITS");
            System.out.println("2. DISPLAY THE FRUITS");
            System.out.println("3. DISPLAY THE FRUIT NAMES OF LOW CALORIES FRUITS");
            System.out.println("4. DISPLAY COLOR WISE LIST OF FRUIT NAMES");
            System.out.println("5. DISPLAY ONLY RED COLOR FRUITS SORTED AS PER THEIR PRICE IN ASCENDING ORDER");
            System.out.println("6. EXIT");
            System.out.println("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            switch (choice){

                case 1:
                    Fruits fruits = new Fruits();

                    sc.nextLine();
                    System.out.print("Enter the name of fruit: ");
                    String name = sc.nextLine();
                    fruits.setName(name);
                    System.out.print("Enter the calories in fruit: ");
                    int calories = sc.nextInt();
                    fruits.setCalories(calories);
                    System.out.print("Enter the price of the fruit: ");
                    int price = sc.nextInt();
                    fruits.setPrice(price);
                    System.out.print("Enter the color of the fruit: ");
                    String color = sc.next();
                    fruits.setColor(color);

                    arrayList.add(fruits);
                    break;

                case 2:
                    System.out.println("Fruits in the List are: ");
                    for(Fruits i: arrayList){
                        System.out.println("Name: "+i.getName()+", Calories: "+i.getCalories()+", Price: "+i.getPrice()+", Color: "+i.getColor());
                    }
                    break;

                case 3: List<String> list = new ArrayList<>();

                        list = reverseSort(arrayList);

                        for (String str: list){
                            System.out.println("Fruit Name: "+str);
                        }
                        break;

                case 4: ArrayList<Fruits> arrayList1 = new ArrayList<>();

                        arrayList1 = sort(arrayList);

                        for(Fruits fruits1: arrayList1){
                            System.out.println("Fruit Name: "+fruits1.getName()+", Fruit Color: "+fruits1.getColor());
                        }
                        break;

                case 5: ArrayList<Fruits> arrayList2 = new ArrayList<>();
                        arrayList2 = filterRedSortPrice(arrayList);

                        for (Fruits fruits1: arrayList2){
                            System.out.println("Fruit Name: "+fruits1.getName()+", Fruit Price: "+fruits1.getPrice());
                        }
                        break;
                case 6: System.exit(0);

                default:
                    System.out.println("PLEASE ENTER THE RIGHT CHOICE!!");

            }
        }while (choice!=6);
    }
}
