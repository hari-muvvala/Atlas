package trainertasks.day20;

// Implements Shape interface
public class Task5_Circle implements Task5_Shape {
    private int radius;

    public Task5_Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}