package trainertasks.day20;

// Simulates sending an email — mock logic
public class Task4_EmailSender {
    public void sendEmail(Task4_Employee employee) {
        System.out.println("Sending email to " + employee.getEmail());
        System.out.println("   Email sent successfully.");
    }
}