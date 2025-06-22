package trainertasks.day11;

import java.io.*;
import java.util.Scanner;

public class Task3_WriteFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some text to write to the file:");
        String input = sc.nextLine();

        File f = new File("UserInputFile.txt");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte[] data = input.getBytes(); // convert string to byte[]
            fos.write(data);
            fos.close();

            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}