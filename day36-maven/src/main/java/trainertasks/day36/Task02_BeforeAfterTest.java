package trainertasks.day36;

import org.junit.jupiter.api.*;

public class Task02_BeforeAfterTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @Test
    void testOne() {
        System.out.println("Test case 1");
    }

    @Test
    void testTwo() {
        System.out.println("Test case 2");
    }
}