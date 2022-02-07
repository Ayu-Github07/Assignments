import java.util.Arrays;
import java.util.List;

public class Assignment6Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    interface ProcessWords{
        public String processWords(List<String> list);
    }

    public static ProcessWords processWords(){
        return (list)->{
            String result = "";
            for (String i: list){
                result += i.charAt(0);
            }
            return result;
        };
    }
    public static void main(String[] args) {
        String ans;
        ans = processWords().processWords(list);
        System.out.println("String formed by using first letter of each word in the list of words: "+ans);
    }

}
