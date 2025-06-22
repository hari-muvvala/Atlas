package trainertasks.day11;

import java.io.*;

public class Task1_WriteByte {
    public static void main(String[] args) {
        File f1 = new File("FileName01.txt");
        FileOutputStream outFile = null;

        // Byte array representing "I LOVE INDIA"
        byte[] text = { 'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A' };

        try {
            outFile = new FileOutputStream(f1);
            outFile.write(text);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!");
    }
}