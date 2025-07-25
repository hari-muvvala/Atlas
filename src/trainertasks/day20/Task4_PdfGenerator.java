package trainertasks.day20;

// Simulates generating a PDF — mock logic
public class Task4_PdfGenerator {
    public void generatePdfReport(Task4_Employee employee) {
        System.out.println("Generating PDF Report for " + employee.getName());
        System.out.println("   Name: " + employee.getName());
        System.out.println("   Salary: ₹" + employee.getSalary());
        System.out.println("   Report generated successfully.");
    }
}