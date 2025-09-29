package trainertasks.day36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculator {
    int add(int a, int b) { return a + b; }
}

public class Task13_TDDExample {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4));
    }
}