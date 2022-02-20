public class Practice1 {
    public static void main(String[] args) {

        try{
            int a = 50/0;  //checked exception
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Madhvi Chauhan");

//        try{
//            int arr[] = new int[5];
//
//       {0,1,2,3,4}
//            arr[10] = 50;  //unchecked exception
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//         System.out.println("Madhvi Chauhan");
    }
}
