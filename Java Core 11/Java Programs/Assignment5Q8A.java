import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Assignment5Q8A {
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");

        Iterator iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));

            cityCode.put("Istanbul", "Turkey");
        }
    }
}
