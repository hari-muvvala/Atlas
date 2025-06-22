package selflearning.stage1javabasics.oop;

class Vehicle {
    Vehicle() {
        System.out.println("selflearning.stage1javabasics.oop.Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        super();  // Optional, but good to understand
        System.out.println("selflearning.stage1javabasics.oop.Car constructor called");
    }
}

class ElectricCar extends Car {
    ElectricCar() {
        super();  // Calls selflearning.stage1javabasics.oop.Car constructor
        System.out.println("selflearning.stage1javabasics.oop.ElectricCar constructor called");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
    }
}