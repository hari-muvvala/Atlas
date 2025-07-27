package trainertasks.day21;

// Interface forces all shapes to implement both area and volume
interface ICalcShapesArea {
    void calculateArea();
    void calculateVolume();  // Not all shapes need volume
}

// Cube supports both area and volume — valid implementation
class Cube implements ICalcShapesArea {
    public void calculateArea() {
        System.out.println("Calculating surface area of cube.");
    }

    public void calculateVolume() {
        System.out.println("Calculating volume of cube.");
    }
}

// Circle doesn't have volume, but is still forced to implement it
class Circle implements ICalcShapesArea {
    public void calculateArea() {
        System.out.println("Calculating area of circle.");
    }

    public void calculateVolume() {
        // ISP Violation: Circle doesn't have volume, but must define this
        throw new UnsupportedOperationException("Circle doesn't have volume.");
    }
}

// Driver class
public class Task3_ISPViolation {
    public static void main(String[] args) {
        ICalcShapesArea cube = new Cube();
        cube.calculateArea();
        cube.calculateVolume();

        ICalcShapesArea circle = new Circle();
        circle.calculateArea();
        circle.calculateVolume();  // Will throw runtime exception
    }
}