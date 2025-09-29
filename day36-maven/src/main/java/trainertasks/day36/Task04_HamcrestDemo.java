package trainertasks.day36;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Task04_HamcrestDemo {
    @Test
    void testHamcrestMatchers() {
        assertThat(10, greaterThan(5));
        assertThat("Hari", startsWith("Ha"));
        assertThat(new int[]{1, 2, 3}, hasItemInArray(2));
    }
}