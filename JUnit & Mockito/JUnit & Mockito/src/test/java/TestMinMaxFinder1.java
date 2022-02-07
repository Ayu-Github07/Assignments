import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMinMaxFinder1 {
    MinMaxFinder1 expected;
    MinMaxFinder1 actual;
    @BeforeEach
    public void init(){
        expected = new MinMaxFinder1(3,56);
        actual = new MinMaxFinder1();
        actual = actual.minMaxFinder1(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});

    }

    @Test()
    @Order(1)
    public void testMinFinder1(){
        Assertions.assertEquals(expected.min,actual.min);
    }

    @Test
    @Order(2)
    public void testMaxFinder1(){
        Assertions.assertEquals(expected.max,actual.max);
    }

    @AfterEach
    public void Clean(){
        actual = expected = null;
    }
}
