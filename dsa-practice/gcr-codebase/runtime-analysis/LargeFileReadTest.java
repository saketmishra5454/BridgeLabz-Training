import java.io.*;

public class LargeFileReadTest {

    // ------------------------------
    // Read using FileReader
    // ------------------------------
    public static long readUsingFileReader(String path) {
        long start = System.currentTimeMillis();
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            int data;
            while ((data = fr.read()) != -1) {
                // reading character by character
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {}
        }

        return System.currentTimeMillis() - start;
    }

    // ------------------------------
    // Read using InputStreamReader
    // ------------------------------
    public static long readUsingInputStreamReader(String path) {
        long start = System.currentTimeMillis();

        FileInputStream fis = null;
        InputStreamReader isr = null;

        try {
            fis = new FileInputStream(path);
            isr = new InputStreamReader(fis, "UTF-8");

            int data;
            while ((data = isr.read()) != -1) {
                // reading character after conversion from bytes
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        } finally {
            try {
                if (isr != null) isr.close();
                if (fis != null) fis.close();
            } catch (IOException e) {}
        }

        return System.currentTimeMillis() - start;
    }

    // ------------------------------
    // Main Test Runner
    // ------------------------------
    public static void main(String[] args) {

        String filePath = "large.txt"; // Supply 500MB file for true test

        System.out.println("===== Large File Reading Efficiency Test =====\n");
        System.out.println("File: " + filePath + "\n");

        long t1 = readUsingFileReader(filePath);
        System.out.println("FileReader Time        : " + t1 + " ms");

        long t2 = readUsingInputStreamReader(filePath);
        System.out.println("InputStreamReader Time : " + t2 + " ms");

        System.out.println("\nConclusion: " +
                (t2 < t1 ? "InputStreamReader is faster" : "FileReader is faster"));
    }
}
