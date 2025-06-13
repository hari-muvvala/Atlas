public class Task013 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        Task013.InnerClass myInner = new Task013.InnerClass();
        Task013 myOuter = new Task013();
        System.out.println(myInner.y + myOuter.x);
    }
}