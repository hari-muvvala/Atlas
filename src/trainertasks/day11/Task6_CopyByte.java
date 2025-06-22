package trainertasks.day11;

import java.io.*;

public class Task6_CopyByte {
    public static void main(String[] args) {
        try {
            FileInputStream inFile = new FileInputStream("FileName01.txt");
            FileOutputStream outFile = new FileOutputStream("FileName05.txt");

            int byteRead;

            while ((byteRead = inFile.read()) != -1) {
                outFile.write(byteRead);
            }

            System.out.println("Byte Copied From FileName01.txt to FileName05.txt");

            inFile.close();
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}