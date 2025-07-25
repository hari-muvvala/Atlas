package trainertasks.day20;

// Sends OTP via Email
public class Task2_EmailNotify implements Task2_BankNotifications {
    @Override
    public void sendOTP() {
        System.out.println("OTP sent to your email address.");
    }
}