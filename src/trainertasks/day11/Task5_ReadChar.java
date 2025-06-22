package trainertasks.day11;

import java.io.*;

public class Task5_ReadChar {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("FileName03.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // print character directly
            }

            System.out.println("\nReading complete");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}