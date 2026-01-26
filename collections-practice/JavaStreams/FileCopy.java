import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // source and destination file paths 
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File(sourceFile);

            // checking if source file exists
            if (!file.exists()) {
                System.out.println("Source file does not exist!");
                return; // exit the program
            }

            // opening streams
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile); // new file created if not exists

            int byteData;
            // reading byte by byte and writing to output file
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());

        } finally {
            // closing streams in finally block so they always close
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
