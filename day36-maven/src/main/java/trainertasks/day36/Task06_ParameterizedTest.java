package trainertasks.day36;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task06_ParameterizedTest {
    @ParameterizedTest
    @ValueSource(strings = {"Hari", "Gopal", "Sai"})
    void testStringNotEmpty(String value) {
        assertTrue(value.length() > 0);
    }
}