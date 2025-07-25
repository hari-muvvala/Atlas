package trainertasks.day20;

// Main class to test SRP implementation
public class Task4_SRP_Main {
    public static void main(String[] args) {
        Task4_Employee employee = new Task4_Employee("HariGopal", "hari@example.com", 85000.0);

        Task4_PdfGenerator pdfGen = new Task4_PdfGenerator();
        pdfGen.generatePdfReport(employee);

        Task4_EmailSender emailSender = new Task4_EmailSender();
        emailSender.sendEmail(employee);
    }
}