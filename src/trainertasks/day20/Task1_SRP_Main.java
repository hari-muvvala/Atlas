package trainertasks.day20;

// Main class to run Task 1
public class Task1_SRP_Main {
    public static void main(String[] args) {
        Task1_Customer customer = new Task1_Customer("day20_task1_HariGopal", "C001");
        Task1_ManagingFiles fileManager = new Task1_ManagingFiles();
        fileManager.saveCustomerToFile(customer);
    }
}