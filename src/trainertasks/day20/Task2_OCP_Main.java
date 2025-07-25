package trainertasks.day20;

// Main class to test all notifications
public class Task2_OCP_Main {
    public static void main(String[] args) {
        Task2_BankNotifications email = new Task2_EmailNotify();
        Task2_BankNotifications mobile = new Task2_MobileNotify();
        Task2_BankNotifications whatsapp = new Task2_WhatsappNotify();

        email.sendOTP();
        mobile.sendOTP();
        whatsapp.sendOTP();
    }
}