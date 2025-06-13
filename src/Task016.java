public class Task016 {
    public static void main(String[] args) {
        Manager manager = new Manager("Hari", 28, "Software Engineer", 50000, "Tech", 5);
        System.out.println(manager);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name; }
    public int getAge() {return age; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
    public String getDesignation() { return designation; }
    public double getSalary() {return salary; }

    @Override
    public String toString() {
        return super.toString() + ", Designation: " + designation + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, int age, String designation, double salary, String department, int teamSize) {
        super(name, age, designation, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {return department; }
    public int getTeamSize() {return teamSize; }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Team Size: " + teamSize;
    }
}