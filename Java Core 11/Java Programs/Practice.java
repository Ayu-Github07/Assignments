

public class Practice {
    public static void main(String[] args) {
        //Arithmetic Exception
        //        try {
//            int a = 50/0;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }

        //Null Pointer exception
//        try{
//            String s = null;
//            System.out.println(s.length());
//        }catch (NullPointerException e){
//            System.out.println(e);
//        }
//
//        System.out.println("Rest of the code is working");

        //ArrayIndexOutOfBound
//        {0,1,2,3,4};
        try{
            int a[] = new int[5];
            a[10] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
//        finally {
//            System.out.println("Rest of the code is working");
//        }


    }
}
