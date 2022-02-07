import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Assignment4 {

    @BeforeAll
    static void meth1(){
        System.out.println("BeforeAll :- This will execute only once and before all the test methods: \n");
    }

    @BeforeEach
    public void meth2(){
        System.out.println("BeforeEach :- This will always execute before all the test methods: ");
    }

    @Test
    @Order(1)
    public void meth5(){
        System.out.println("HELLO FROM TEST METHOD-1");
    }
    @Test
    @Order(2)
    public void meth6(){
        System.out.println("HELLO FROM TEST METHOD-2");
    }
    @Test
    @Order(3)
    public void meth7(){
        System.out.println("HELLO FROM TEST METHOD-3");
    }
    @AfterEach
    public  void meth3(){
        System.out.println("AfterEach :- This will always execute after all the test methods: \n");
    }

    @AfterAll
    static void meth4(){
        System.out.println("AfterAll :- This will execute only once and after all the test methods: \n");
    }
}
