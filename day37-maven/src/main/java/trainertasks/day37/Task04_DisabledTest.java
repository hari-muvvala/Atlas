package trainertasks.day37;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Task04_DisabledTest {
    @Test
    @Disabled("Temporarily skipped until feature is ready")
    void testDisabled() {
        System.out.println("This test is disabled");
    }
}