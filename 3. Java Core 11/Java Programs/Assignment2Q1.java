class SingletonInheritanceCheck{

    private static SingletonInheritanceCheck X = null;

    private SingletonInheritanceCheck(){
        System.out.println("HI, I am a statement inside the singleton class");
    }

    public static SingletonInheritanceCheck getInstance(){
        if (X== null)
            X = new SingletonInheritanceCheck();

        return X;
    }
}

public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck x = SingletonInheritanceCheck.getInstance();

        // Instantiating Singleton class with variable y
        SingletonInheritanceCheck y = SingletonInheritanceCheck.getInstance();

        // Instantiating Singleton class with variable z
        SingletonInheritanceCheck z = SingletonInheritanceCheck.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
