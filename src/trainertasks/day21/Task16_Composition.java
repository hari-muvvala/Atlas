package trainertasks.day21;

// Class B: Wheel is strongly owned by Car
class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

// Class A: Car owns Wheel objects — composition
public class Task16_Composition {
    private Wheel[] wheels;

    public Task16_Composition() {
        // Creating wheels during Car creation — strong ownership
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void showCarDetails() {
        System.out.println("Car has 4 wheels");
    }

    public static void main(String[] args) {
        Task16_Composition car = new Task16_Composition();
        car.showCarDetails();
    }
}