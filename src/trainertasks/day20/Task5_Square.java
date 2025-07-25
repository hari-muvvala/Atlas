package trainertasks.day20;

// Implements Shape interface
public class Task5_Square implements Task5_Shape {
    private int height;

    public Task5_Square(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * height;
    }
}