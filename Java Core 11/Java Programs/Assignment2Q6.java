abstract class Persistence{
    abstract public String Persist();
}

class FilePersistence extends Persistence{
    @Override
    public String Persist() {
        return "This is the Persist method of File Persistence Method.";
    }
}

class DatabasePersistence extends Persistence{
    @Override
    public String Persist() {
        return "This is the Persist method of Database Persistence Method.";
    }
}
public class Assignment2Q6 {
    public static void main(String[] args) {
        //Creating an instance of File Persistence class.
        FilePersistence filePersistence = new FilePersistence();

        System.out.println(filePersistence.Persist());

        //Creating an instance of Database Persistence class.
        DatabasePersistence databasePersistence = new DatabasePersistence();
        System.out.println(databasePersistence.Persist());
    }
}
