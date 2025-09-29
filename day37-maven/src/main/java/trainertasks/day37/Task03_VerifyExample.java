package trainertasks.day37;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class Task03_VerifyExample {
    @Test
    void testVerify() {
        List<String> mockList = Mockito.mock(List.class);

        mockList.add("Sai");
        mockList.clear();

        Mockito.verify(mockList).add("Sai");
        Mockito.verify(mockList).clear();
    }
}