package day23tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareUtilityTest {

    @Test
    public void testCompare_FirstGreater() {
        CompareUtility util = new CompareUtility();
        int result = util.compare(10, 5);
        assertEquals(1, result);
    }

    @Test
    public void testCompare_SecondGreater() {
        CompareUtility util = new CompareUtility();
        int result = util.compare(5, 10);
        assertEquals(-1, result);
    }

    @Test
    public void testCompare_EqualNumbers() {
        CompareUtility util = new CompareUtility();
        int result = util.compare(7, 7);
        assertEquals(0, result);
    }
}