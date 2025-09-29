package trainertasks.day37;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task06_ParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testEvenNumbers(int number) {
        assertTrue(number % 2 == 0);
    }
}