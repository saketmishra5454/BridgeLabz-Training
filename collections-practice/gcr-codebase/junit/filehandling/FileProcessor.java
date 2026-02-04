package junit.filehandling;
import java.io.*;

public class FileProcessor {

    // Write to file
    public void writeToFile(String file, String text) throws IOException {

        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
    }

    // Read from file
    public String readFromFile(String file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        br.close();

        return line;
    }
}
