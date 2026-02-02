package exceptionHandling;
import java.io.*;

public class ReadFile {

    public static void main(String[] args) {

        try {

            // FileReader is used to open the file
            FileReader fr = new FileReader("data.txt");

            // BufferedReader helps to read line by line
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file till end
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

            // Always close file
            br.close();

        } catch (IOException e) {

            // If file is not found or any IO error
            System.out.println("File not found");
        }
    }
}
