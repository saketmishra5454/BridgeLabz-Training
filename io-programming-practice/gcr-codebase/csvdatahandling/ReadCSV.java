package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSV {

    public static void main(String[] args) {
        // File name (CSV file)
        String fileName = "students.csv";
        BufferedReader br = null;
        String line = "";

        try {
            // Open CSV file
            br = new BufferedReader(new FileReader(fileName));

            System.out.println("Student Records:\n");

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line using comma
                String[] data = line.split(",");
                // Printing in proper format
                System.out.println("ID    : " + data[0]);
                System.out.println("Name  : " + data[1]);
                System.out.println("Age   : " + data[2]);
                System.out.println("Marks : " + data[3]);

                System.out.println("---------------------");
            }

        } catch (IOException e) {

            // If file not found or error
            System.out.println("Error reading CSV file");

        } finally {
            // Closing file
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
