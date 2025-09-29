package trainertasks.day36;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task14_BDDStyleMockito {
    @Test
    void testBDDMockito() {
        List<String> mockList = mock(List.class);

        given(mockList.get(0)).willReturn("Hari");
        String result = mockList.get(0);

        assertEquals("Hari", result);
        then(mockList).should().get(0);
    }
}