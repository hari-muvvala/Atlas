package trainertasks.day37;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Task08_AssertThatHamcrest {
    @Test
    void testHamcrestMatchers() {
        assertThat("Harigopal", containsString("Hari"));
        assertThat(42, greaterThan(40));
        assertThat(new String[]{"A", "B", "C"}, arrayContaining("A", "B", "C"));
    }
}