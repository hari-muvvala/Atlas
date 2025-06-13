public class Task011 {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        Task011 myOuter = new Task011();
        Task011.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}