import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderExample {

    public static void main(String[] args) {
        String filePath = "data.txt"; // file encoded in UTF-8

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            // Step 1: Read binary data from file
            fis = new FileInputStream(filePath);

            // Step 2: Convert byte stream to char stream (UTF-8 charset)
            isr = new InputStreamReader(fis, "UTF-8");

            // Step 3: Efficient reading using BufferedReader
            br = new BufferedReader(isr);

            // Step 4: Read and print lines
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // Step 5: Close resources
            try {
                if (br != null) br.close();
                if (isr != null) isr.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }
    }
}
