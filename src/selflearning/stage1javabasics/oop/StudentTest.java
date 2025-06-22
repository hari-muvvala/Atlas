package selflearning.stage1javabasics.oop;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Hari Gopal");
        s1.setRollNo(101);

        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNo());
    }
}