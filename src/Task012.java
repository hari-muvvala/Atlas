public class Task012 {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        Task012 myOuter = new Task012();
        Task012.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}