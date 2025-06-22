package selflearning.stage1javabasics.oop;

class Test extends Thread {
    public void run() {
        System.out.println("Thread started.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.run(); // Not t1.start()
    }
}