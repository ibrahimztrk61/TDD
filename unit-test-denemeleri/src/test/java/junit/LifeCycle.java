package junit;

import org.junit.jupiter.api.*;

public class LifeCycle {

    @BeforeAll
    public static void beforeAll(){
        System.out.println( "Write Hello Before All Tests:");
    }
    @BeforeEach
    public void beforeTest(){
        System.out.println("Write Hello before each Test:");
    }

    @AfterEach
    public void afterTest(){
        System.out.println("Write Hello after each Test:");
    }

    @Test
    public void helloTest() {
        System.out.println("Hello Test:");
    }

    @Test
    public void helloTest2() {
        System.out.println("Hello Test2:");
    }


    @AfterAll
    public static void afterAll(){
        System.out.println("Write Hello After All Tests:");
    }


}
