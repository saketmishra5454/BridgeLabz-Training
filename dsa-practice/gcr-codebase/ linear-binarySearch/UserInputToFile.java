import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader br = null;
        FileWriter writer = null;

        try {
            // Step 1: Read from console
            br = new BufferedReader(new InputStreamReader(System.in));

            // Step 2: File writer to write user input
            writer = new FileWriter("user_input.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (true) {
                // Step 3: Read a line from console
                line = br.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                // Step 4: Write to file with new line
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Input saved to user_input.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Close file & reader
            try {
                if (writer != null) writer.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }
    }
}
