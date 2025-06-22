package selflearning.stage1javabasics.oop;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("selflearning.stage1javabasics.oop.TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("selflearning.stage1javabasics.oop.TV is turned OFF");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.turnOn();
        myTV.turnOff();
    }
}