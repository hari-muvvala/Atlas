package trainertasks.day36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task03_AssertMethods {
    @Test
    void testAssertions() {
        String name = "Hari";
        assertEquals("Hari", name);
        assertNotNull(name);
        assertTrue(name.startsWith("Ha"));
        assertFalse(name.isEmpty());
    }
}