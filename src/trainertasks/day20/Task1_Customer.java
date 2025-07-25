package trainertasks.day20;

// Only holds customer data — SRP respected
public class Task1_Customer {
    private String name;
    private String custID;

    public Task1_Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }
}