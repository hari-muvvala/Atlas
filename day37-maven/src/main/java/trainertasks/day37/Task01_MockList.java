package trainertasks.day37;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task01_MockList {
    @Test
    void testMockList() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("Hari");

        String value = mockList.get(0);
        assertEquals("Hari", value);
    }
}