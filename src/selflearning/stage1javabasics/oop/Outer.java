package selflearning.stage1javabasics.oop;

public class Outer {
    static String outerData = "Static member of selflearning.stage1javabasics.oop.Outer";

    static class Inner {
        void display() {
            System.out.println("Accessing: " + outerData);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        //Inner obj = new Inner();
        obj.display();
    }
}