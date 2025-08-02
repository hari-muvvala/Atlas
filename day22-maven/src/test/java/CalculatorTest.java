import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        assertEquals(8, sum);
    }

    @Test
    public void testMultiplication() {
        int a = 4;
        int b = 6;
        int product = a * b;
        assertEquals(24, product);
    }
}