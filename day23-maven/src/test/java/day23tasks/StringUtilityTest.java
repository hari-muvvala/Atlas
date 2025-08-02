package day23tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {

    @Test
    public void testReverse_NormalCase() {
        StringUtility util = new StringUtility();
        String result = util.reverse("hello");
        assertEquals("olleh", result);
    }

    @Test
    public void testReverse_EmptyString() {
        StringUtility util = new StringUtility();
        String result = util.reverse("");
        assertEquals("", result);
    }

    @Test
    public void testReverse_NullInput() {
        StringUtility util = new StringUtility();
        String result = util.reverse(null);
        assertEquals(null, result);
    }
}