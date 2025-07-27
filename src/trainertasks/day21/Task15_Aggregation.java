package trainertasks.day21;

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Driver Name: " + name);
    }
}

public class Task15_Aggregation {
    Driver driver;

    Task15_Aggregation(Driver driver) {
        this.driver = driver;
    }

    void showCarInfo() {
        System.out.println("Car has a driver:");
        driver.showName();
    }

    public static void main(String[] args) {
        Driver d = new Driver("Hari");
        Task15_Aggregation car = new Task15_Aggregation(d);
        car.showCarInfo();
    }
}