abstract class AbstractClass{
   public int a;
   public int b;

   public AbstractClass(){
       System.out.println("Hi, I am a constructor of Abstract class with an Abstract method.");
   }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    abstract int Sum();
}
abstract class Base1{
    public Base1(){
        System.out.println("Hi, I am a constructor of an Abstract class without any Abstract method");
    }
}
class Derived extends AbstractClass{

    @Override
    int Sum() {
        return a+b;
    }
}

class Derived1 extends Base1{

}
public class Assignment2Q4 {
    public static void main(String[] args) {
        /*
        We cannot create an instance of an abstract class
        that's why
         AbstractClass abstractClass = new AbstractClass();
         will throw an error.
        */
        Derived derived = new Derived();
        System.out.println("Enter the values of a and b: ");
        derived.setA(20);
        derived.setB(30);

        System.out.println("Values of a and b are: ");
        System.out.print("a = "+derived.getA());
        System.out.println(" b = "+derived.getB());

        System.out.println("The sum of a and b are: "+derived.Sum());

        Derived1 derived1 = new Derived1();

    }
}
