package trainertasks.day21;

// Superclass: all birds expected to fly
abstract class Bird {
    abstract void fly();  // LSP assumption: all birds can fly
}

// Eagle is a proper subclass — behavior is as expected
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

// Ostrich is a subclass of Bird, but it breaks LSP
class Ostrich extends Bird {
    @Override
    public void fly() {
        // LSP Violation: Ostrich cannot actually fly
        System.out.println("Ostrich can't fly but it lays big eggs.");
    }
}

// Driver class
public class Task1_LSPViolation {
    public static void main(String[] args) {
        Bird bird1 = new Eagle();    // Valid substitution
        bird1.fly();

        Bird bird2 = new Ostrich();  // Substitution breaks expected behavior
        bird2.fly();
    }
}