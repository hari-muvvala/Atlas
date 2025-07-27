package trainertasks.day21;

// Abstraction for birds that can fly
abstract class FlyingBird {
    abstract void fly();
}

// Abstraction for birds that cannot fly
abstract class NonFlyingBird {
    abstract void walk();
}

// Eagle is a flying bird — valid usage
class Eagle2 extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

// Ostrich is a non-flying bird — not forced to implement fly()
class Ostrich2 extends NonFlyingBird {
    @Override
    public void walk() {
        System.out.println("Ostrich walks fast.");
    }
}

// Driver class
public class Task2_LSPCorrect {
    public static void main(String[] args) {
        FlyingBird bird1 = new Eagle2();
        bird1.fly();  // Correct behavior for flying bird

        NonFlyingBird bird2 = new Ostrich2();
        bird2.walk(); // Correct behavior for non-flying bird
    }
}