package trainertasks.day20;

// Sends OTP via SMS
public class Task2_MobileNotify implements Task2_BankNotifications {
    @Override
    public void sendOTP() {
        System.out.println("OTP sent to your mobile number.");
    }
}