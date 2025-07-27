package trainertasks.day21;

class Student12 {
    private int rollNo = 0;

    public int getRollNo() {
        System.out.println("Inside getRollNo()");
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo <= 100) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Invalid roll number: should be ≤ 100");
        }
    }
}

public class Task12_LooseCoupling {
    public static void main(String[] args) {
        // Create object using abstraction (loose coupling)
        Student12 student = new Student12();

        student.setRollNo(10);
        System.out.println("The roll number of the student is: " + student.getRollNo());
    }
}