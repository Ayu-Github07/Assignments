//1. What are all the unique cities where the traders work?
//2. Find all traders from Pune and sort them by name.
//3. Return a string of all traders’ names sorted alphabetically.
//4. Are any traders based in Indore?


import java.util.*;

class Trader {
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Trader(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader)) return false;
        Trader trader = (Trader) o;
        return name.equals(trader.name) && city.equals(trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    public static Comparator<Trader> comparator = new Comparator<Trader>() {
        @Override
        public int compare(Trader o1, Trader o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}


public class Assignment7Q3 {

    public static List<String> printUniqueCities (List <Trader> traders) {

        Map<String,String> map = new HashMap<>();
        List<String> cities = new ArrayList<>();

        for (Trader trader: traders){
            map.putIfAbsent(trader.getCity(),trader.getName());
        }

        for (Map.Entry<String,String> mp: map.entrySet()){
            cities.add(mp.getKey());
        }
        return cities;
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        List<String> tradersFromPune = new ArrayList<>();

        for (Trader trader: traders){
            if(trader.getCity().toUpperCase().equals("PUNE")){
                tradersFromPune.add(trader.getName());
            }
        }

        Collections.sort(tradersFromPune);
        return tradersFromPune;
    }
    public static List<Trader> allTrader3Names(List<Trader> traders) {
       traders.sort(Trader.comparator);
        return traders;
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader> traderList = new ArrayList<>();

        for(Trader trader: traders){
            if(trader.getCity().toUpperCase().equals("INDORE")){
                traderList.add(trader);
            }
        }
        return traderList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Trader> arrayList = new ArrayList<>();

        Trader trader1 = new Trader("Ayush Agrawal","Pune");
        Trader trader2 = new Trader("Ritik Dixit","Bangalore");
        Trader trader3 = new Trader("Atharva Upadhye","Pune");
        Trader trader4 = new Trader("Pratik Nandurkar","Pune");
        Trader trader5 = new Trader("Shraddha Gupta","Indore");
        Trader trader6 = new Trader("Akanksha Ramgirwar","Indore");

        arrayList.add(trader1);
        arrayList.add(trader2);
        arrayList.add(trader3);
        arrayList.add(trader4);
        arrayList.add(trader5);
        arrayList.add(trader6);

        int choice;
        do{
            System.out.println("\n1. ENTER THE TRADERS DETAILS");
            System.out.println("2. DISPLAY THE TRADERS DETAILS");
            System.out.println("3. DISPLAY ALL UNIQUE CITIES WHERE TRADERS WORK");
            System.out.println("4. DISPLAY ALL TRADERS FROM PUNE SORTED BY NAME");
            System.out.println("5. DISPLAY ALL TRADERS NAMES SORTED ALPHABETICALLY");
            System.out.println("6. DISPLAY ALL TRADERS FROM INDORE");
            System.out.println("7. EXIT");
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Trader trader = new Trader();
                    sc.nextLine();
                    System.out.println("Enter the Trader Name: ");
                    String name = sc.nextLine();
                    trader.setName(name);

                    System.out.println("Enter the City Name: ");
                    String city = sc.nextLine();
                    trader.setCity(city);

                    arrayList.add(trader);
                    break;

                case 2:
                    System.out.println("List of traders: ");
                    for (Trader trade: arrayList){
                        System.out.println("Trader Name: "+trade.getName());
                        System.out.println("Trader City: "+trade.getCity());
                    }
                    System.out.println();
                    break;

                case 3:
                    List<String> list = new ArrayList<>();
                    list = printUniqueCities(arrayList);

                    System.out.println("All uniques cities where traders work: ");
                    for (String str: list){
                        System.out.println(str);
                    }
                    System.out.println();
                    break;

                case 4:
                    List<String> list1 = new ArrayList<>();
                    list1 = tradersFromPuneSortByName(arrayList);

                    System.out.println("All traders from Pune: ");
                    for (String str: list1){
                        System.out.println(str);
                    }
                    System.out.println();
                    break;

                case 5: List<Trader> arraylist2 = new ArrayList<>();
                arraylist2 = allTrader3Names(arrayList);

                    System.out.println("All Traders Name:");
                    for(Trader trader7: arraylist2){
                        System.out.println("Name: "+trader7.getName());
                        System.out.println("City: "+trader7.getCity());
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 6: List<Trader> traderList = new ArrayList<>();
                    traderList = areAnyTradersFromIndore(arrayList);
                    System.out.println("All traders from Indore: ");
                    for(Trader trader7: traderList){
                        System.out.println("Name: "+trader7.getName());
                    }
                    System.out.println();
                    break;


                case 7: System.exit(0);

                default:
                    System.out.println("PLEASE ENTER THE RIGHT CHOICE!");
            }
        }while (choice!=7);
    }
}
