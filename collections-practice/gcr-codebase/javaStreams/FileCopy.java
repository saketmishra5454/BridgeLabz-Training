package javaStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        // Source file name (from where data will be read)
        String sourceFile = "input.txt";

        // Destination file name (where data will be written)
        String destFile = "output.txt";

        try {

            // Open source file
            fis = new FileInputStream(sourceFile);

            // Open destination file (it will create file if not exist)
            fos = new FileOutputStream(destFile);

            int ch;

            // Read one byte at a time and write it to new file
            while ((ch = fis.read()) != -1) {

                fos.write(ch);   // writing data
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            // If source file not found or any IO error
            System.out.println("Error: Source file not found or problem in file handling.");
            System.out.println(e.getMessage());

        } finally {

            // Closing files (important step)
            try {

                if (fis != null) {
                    fis.close();
                }

                if (fos != null) {
                    fos.close();
                }

            } catch (IOException e) {

                System.out.println("Error while closing files.");
            }
        }
    }
}
