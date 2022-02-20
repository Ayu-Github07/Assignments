import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class ParkingSlot {
    private String ownerName;
    private int carNumber;
    private int token;
    private int level;
    private int section;
    private int slot;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }


    public void setLevel(int level) {
        this.level = level;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

class Parked_CarOwenerList extends Assignment5Q7{
    int id = 1;
    int levels = 3;
    int sections = 4;
    int slots = 20;
    Map<Integer,Assignment5Q7> car = new HashMap<>();
    Map<Integer,ParkingSlot> parkingSlotMap = new HashMap<>();

    public void add_new_car(Assignment5Q7 obj){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the owner of car: ");
        obj.setName(sc.nextLine());
        System.out.print("Enter the car model: ");
        obj.setCarModel(sc.nextLine());
        System.out.print("Enter the car number: ");
        obj.setCarNo(sc.nextInt());
        System.out.print("Enter the owner mobile number: ");
        obj.setMobileNumber(sc.nextInt());
        System.out.print("Enter the address: ");
        obj.setAddress(sc.nextLine());

        car.put(id,obj);
        id++;
        System.out.println("User Registered Successfully!");
    }
    public void remove_car(String name,int carNo){
        int key = 0;
        for (Map.Entry<Integer, Assignment5Q7> mp: car.entrySet()){
            Assignment5Q7 obj = mp.getValue();
            if(obj.getName().equals(name)&&obj.getCarNo()==carNo){
                key = mp.getKey();
                break;
            }
        }
        car.remove(key);
        System.out.println("CAR REMOVED SUCCESSFULLY");
    }
    public String get_parked_car_location(int token){
        Scanner sc = new Scanner(System.in);
        ParkingSlot parkingSlot = new ParkingSlot();

        System.out.print("Enter the ownerName: ");
        parkingSlot.setOwnerName(sc.nextLine());

        System.out.print("Enter the car number: ");
        parkingSlot.setCarNumber(sc.nextInt());

        System.out.print("Enter the level: ");
        parkingSlot.setLevel(sc.nextInt());

        System.out.print("Enter the Section: ");
        parkingSlot.setLevel(sc.nextInt());

        System.out.print("Enter the Slot: ");
        parkingSlot.setSlot(sc.nextInt());

        parkingSlotMap.put(token,parkingSlot);
        return "CAR PARKED SUCCESSFULLY!";
    }
}

public class Assignment5Q7 {
   String name;
   String carModel;
    int carNo;
    int mobileNumber;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void menu(){
        Parked_CarOwenerList parked_carOwenerList = new Parked_CarOwenerList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1) ADD NEW CAR");
            System.out.println("2) REMOVE CAR");
            System.out.println("3) PARK THE CAR");
            System.out.println("4) EXIT");
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();
            switch (choice){
                case 1: parked_carOwenerList.add_new_car(new Assignment5Q7());
                        break;
                case 2: String name;
                int number;
                    System.out.print("Enter the owner name: ");
                    name = sc.next();
                    System.out.print("Enter the car number: ");
                    number = sc.nextInt();

                        parked_carOwenerList.remove_car(name,number);
                        break;
                case 3:
                    System.out.println(parked_carOwenerList.get_parked_car_location(101));
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("PLEASE ENTER THE CORRECT CHOICE!!");
            }
        }while (choice!=4);
    }
    public static void main(String[] args) {
        Assignment5Q7 obj = new Assignment5Q7();
        obj.menu();
    }
}
