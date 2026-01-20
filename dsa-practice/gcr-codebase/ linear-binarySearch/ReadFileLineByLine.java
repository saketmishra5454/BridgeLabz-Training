import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        // Path to the file (change if needed)
        String filePath = "sample.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Step 1: Create FileReader
            fr = new FileReader(filePath);

            // Step 2: Wrap in BufferedReader
            br = new BufferedReader(fr);

            // Step 3: Read lines in a loop
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // Step 4: Close the file
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
