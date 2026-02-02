package javaStreams;

import java.io.*;

public class LowerCaseFile {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("input.txt"));

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();

                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Converted");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
