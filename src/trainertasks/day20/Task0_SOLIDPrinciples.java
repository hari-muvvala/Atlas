package trainertasks.day20;

// Demonstrates all 5 SOLID principles

// I — Interface Segregation Principle
// D — Dependency Inversion Principle
interface Task0_Notification {
    void send(String message);
}

// S — Single Responsibility Principle
// Each class has one clear responsibility
class Task0_EmailNotification implements Task0_Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class Task0_SMSNotification implements Task0_Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// O — Open/Closed Principle
// Can add more types of notifications without changing this class
// D — Dependency Inversion Principle
class Task0_NotificationSender {
    private Task0_Notification notification;

    public Task0_NotificationSender(Task0_Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}

// L — Liskov Substitution Principle
// Subclasses like Email/SMS behave correctly as Notification types
public class Task0_SOLIDPrinciples {
    public static void main(String[] args) {
        Task0_Notification email = new Task0_EmailNotification();
        Task0_NotificationSender sender1 = new Task0_NotificationSender(email);
        sender1.notifyUser("Welcome to Day 20 of SOLID Principles!");

        Task0_Notification sms = new Task0_SMSNotification();
        Task0_NotificationSender sender2 = new Task0_NotificationSender(sms);
        sender2.notifyUser("Your OTP is 654321");
    }
}