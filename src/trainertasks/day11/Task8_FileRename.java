package trainertasks.day11;

import java.io.*;

public class Task8_FileRename {
    public static void main(String[] args) {
        File oldFile = new File("FileName07.txt");
        File newFile = new File("RenamedFile07.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("✅ File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("❌ Rename failed. Check if the file exists or is open.");
        }
    }
}