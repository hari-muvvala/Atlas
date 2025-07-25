package trainertasks.day20;

// Sends OTP via WhatsApp
public class Task2_WhatsappNotify implements Task2_BankNotifications {
    @Override
    public void sendOTP() {
        System.out.println("OTP sent via WhatsApp.");
    }
}