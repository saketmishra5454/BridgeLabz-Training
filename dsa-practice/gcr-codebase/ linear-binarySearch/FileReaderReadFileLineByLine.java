
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadFileLineByLine {


    public static void main(String[] args) {

        String filePath = "sample.txt"; // change based on your file path

        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Step 1: Create FileReader
            fr = new FileReader(filePath);

            // Step 2: Wrap in BufferedReader
            br = new BufferedReader(fr);

            // Step 3: Read and print lines
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // Step 4: Close resources
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
