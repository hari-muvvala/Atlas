package trainertasks.day21;

// Area-specific interface
interface ICalcArea {
    void calculateArea();
}

// Volume-specific interface
interface ICalcVolume {
    void calculateVolume();
}

// Circle only needs area — clean separation
class Circle2 implements ICalcArea {
    public void calculateArea() {
        System.out.println("Calculating area of circle.");
    }
}

// Cube needs both area and volume
class Cube2 implements ICalcArea, ICalcVolume {
    public void calculateArea() {
        System.out.println("Calculating surface area of cube.");
    }

    public void calculateVolume() {
        System.out.println("Calculating volume of cube.");
    }
}

// Driver class
public class Task4_ISPCorrect {
    public static void main(String[] args) {
        ICalcArea circle = new Circle2();
        circle.calculateArea();

        Cube2 cube = new Cube2();
        cube.calculateArea();
        cube.calculateVolume();
    }
}