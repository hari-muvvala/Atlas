package trainertasks.day21;

// Class B: Engine
class Engine {
    public void start() {
        System.out.println("Engine starting");
    }
}

// Class A: Car depends on Engine but does not own it permanently
public class Task14_Dependency {

    // Car temporarily creates and uses Engine
    public void drive() {
        Engine engine = new Engine();  // dependency
        engine.start();
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Task14_Dependency car = new Task14_Dependency();
        car.drive();
    }
}