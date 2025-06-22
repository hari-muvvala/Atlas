package selflearning.stage1javabasics.oop;

public class Demo {
    int a,b;

    public Demo(int a) {
        this.a = a;
        b = a * 2;
    }

    public void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class ThisTest {
    public static void main(String[] args) {
        Demo d = new Demo(10);
        d.display();
    }
}