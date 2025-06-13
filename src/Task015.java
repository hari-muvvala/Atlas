public class Task015 {
    int x = 10;

    static class InnerClass {
        static int y = 5;
    }

    public static void main(String[] args) {
        Task015.InnerClass myInner = new Task015.InnerClass();
        System.out.println(myInner.y); // Output: 5
    }
}
