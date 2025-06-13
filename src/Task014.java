public class Task014 {
    int x = 50;

    class InnerClass {
        public int innerMethod() {
            return x; // Accessing outer class variable
        }
    }

    public static void main(String[] args) {
        Task014 myOuter = new Task014();
        Task014.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.innerMethod()); // Output will be 50
    }
}