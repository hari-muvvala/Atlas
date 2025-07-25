package trainertasks.day20;

import java.io.FileWriter;
import java.io.IOException;

// Handles file logic only — separate from customer logic
public class Task1_ManagingFiles {
    public void saveCustomerToFile(Task1_Customer customer) {
        try {
            FileWriter fw = new FileWriter(customer.getName().trim() + ".txt");
            fw.write("Customer Name: " + customer.getName() + "\n");
            fw.write("Customer ID: " + customer.getCustID() + "\n");
            fw.close();
            System.out.println("Data saved to file: " + customer.getName().trim() + ".txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}