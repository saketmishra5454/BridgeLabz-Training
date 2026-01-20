import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrence {

    public static void main(String[] args) {

        String filePath = "sample.txt"; // change as needed
        String targetWord = "java";     // word to count (case-insensitive)

        int count = 0;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Step 1: Create FileReader and BufferedReader
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            // Step 2: Read file line by line
            String line;
            while ((line = br.readLine()) != null) {

                // Step 3: Split line into words
                String[] words = line.split("\\s+"); // split by whitespace

                // Step 4: Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++; // increment counter
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // Step 5: Close resources
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
