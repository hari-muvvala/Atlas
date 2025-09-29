package trainertasks.day36;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task10_SpyDemo {
    @Test
    void testSpyList() {
        List<String> spyList = Mockito.spy(new ArrayList<>());

        spyList.add("One");
        spyList.add("Two");

        assertEquals(2, spyList.size());
        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }
}