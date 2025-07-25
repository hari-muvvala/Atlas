package trainertasks.day20;

// Main class to test OCP shape comparison
public class Task5_OCP_Main {
    public static void main(String[] args) {
        Task5_Shape square1 = new Task5_Square(4);  // area = 16
        Task5_Shape square2 = new Task5_Square(5);  // area = 25

        Task5_Shape circle1 = new Task5_Circle(3);  // area = ~28.27
        Task5_Shape circle2 = new Task5_Circle(2);  // area = ~12.57

        Task5_OCP_CompareShapes comparator = new Task5_OCP_CompareShapes();

        System.out.println("Comparing squares: " + comparator.compareArea(square1, square2));
        System.out.println("Comparing circles: " + comparator.compareArea(circle1, circle2));
        System.out.println("Comparing square vs circle: " + comparator.compareArea(square1, circle1));
    }
}