package trainertasks.day21;

// Class with private roll number field and accessors
class Student13 {
    private int rollNo = 0;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0 && rollNo <= 100) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Invalid roll number: should be between 1 and 100");
        }
    }
}

// Consumer class that uses Student13 without knowing internal logic
class LooseCoupling {
    public void display(Student13 student) {
        System.out.println("Displaying roll number via loose coupling: " + student.getRollNo());
    }
}

public class Task13_LooseCoupling {
    public static void main(String[] args) {
        Student13 student = new Student13();
        student.setRollNo(25);

        LooseCoupling util = new LooseCoupling();
        util.display(student); // Student13 object passed, not controlled directly
    }
}