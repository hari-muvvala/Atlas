package trainertasks.day36;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task07_MockDemo {
    @Test
    void testListMock() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("Hello");

        String value = mockList.get(0);
        assertEquals("Hello", value);
    }
}