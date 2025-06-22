package selflearning.stage1javabasics.oop;

public class OverloadDemoTest {
    public static void main(String[] args) {
        OverloadDemo o1 = new OverloadDemo();                // default
        OverloadDemo o2 = new OverloadDemo("Hari");          // 1 param
        OverloadDemo o3 = new OverloadDemo("Hari", 28);      // 2 params

        o1.displayInfo();
        o2.displayInfo();
        o3.displayInfo();
    }
}