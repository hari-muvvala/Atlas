package trainertasks.day36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task05_ExceptionTest {
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}