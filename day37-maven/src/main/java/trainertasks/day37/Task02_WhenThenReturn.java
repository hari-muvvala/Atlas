package trainertasks.day37;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task02_WhenThenReturn {
    @Test
    void testWhenThenReturn() {
        List<String> mockList = Mockito.mock(List.class);

        Mockito.when(mockList.size()).thenReturn(3);
        Mockito.when(mockList.get(1)).thenReturn("Gopal");

        assertEquals(3, mockList.size());
        assertEquals("Gopal", mockList.get(1));
    }
}