package trainertasks.day37;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class Task05_TimeoutTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testTimeout() throws InterruptedException {
        Thread.sleep(1000); // completes within 2s
    }
}