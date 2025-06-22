package trainertasks.day11;

import java.io.*;

public class Task7_MergeFiles {
    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("FileName01.txt");
            FileInputStream file2 = new FileInputStream("FileName03.txt");

            SequenceInputStream combinedStream = new SequenceInputStream(file1, file2);

            BufferedInputStream br1 = new BufferedInputStream(combinedStream);
            BufferedOutputStream br2 = new BufferedOutputStream(new FileOutputStream("FileName07.txt"));

            int ch;
            while ((ch = br1.read()) != -1) {
                br2.write(ch);
            }

            br1.close();
            br2.close();
            file1.close();
            file2.close();

            System.out.println("Merged FileName01.txt and FileName03.txt into FileName07.txt successfully.");
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found or Error occurred...!!!");
        }
    }
}