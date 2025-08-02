package day23tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

class Task01_TaggedTests {

    @Test
    @Tags({@Tag("firstPriority")})
    void testMethod010() {
        System.out.println("Running testMethod010 with firstPriority");
    }

    @Test
    @Tag("firstPriority")
    void runTestcase020() {
        System.out.println("Running runTestcase020 with firstPriority");
    }

    @Test
    @Tags({@Tag("fastTag")})
    void testMethod030() {
        System.out.println("Running testMethod030 with fastTag");
    }

    @Test
    @Tag("slowTag")
    void runTestcase040() {
        System.out.println("Running runTestcase040 with slowTag");
    }
}