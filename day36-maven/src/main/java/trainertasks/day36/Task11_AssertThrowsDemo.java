package trainertasks.day36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task11_AssertThrowsDemo {
    @Test
    void testNullPointer() {
        String str = null;
        assertThrows(NullPointerException.class, () -> {
            str.length();
        });
    }
}