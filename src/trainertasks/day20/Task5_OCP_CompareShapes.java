package trainertasks.day20;

// Compare any two shapes using shared interface
public class Task5_OCP_CompareShapes {
    public double compareArea(Task5_Shape shape1, Task5_Shape shape2) {
        return shape1.getArea() - shape2.getArea();
    }
}