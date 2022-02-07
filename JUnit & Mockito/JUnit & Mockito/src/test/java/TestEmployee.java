import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployee {

    @Test
    public void Show(){
//        System.out.println("Hello from test 1");
        String expected = "HELLO";
        String actual = "HELLO";

        Assertions.assertEquals(expected,actual);
    }
}
