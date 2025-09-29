package trainertasks.day36;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class Task08_VerifyDemo {
    @Test
    void testVerifyCall() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("Hari");

        Mockito.verify(mockList).add("Hari");
    }
}