package selflearning.stage1javabasics.oop;

public class LearnerTest {
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.displayInfo();

        Learner l2 = new Learner("Hari", 28);
        l2.displayInfo();
    }
}