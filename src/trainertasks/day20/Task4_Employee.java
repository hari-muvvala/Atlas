package trainertasks.day20;

// Stores employee details only — SRP respected
public class Task4_Employee {
    private String name;
    private String email;
    private double salary;

    public Task4_Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }
}