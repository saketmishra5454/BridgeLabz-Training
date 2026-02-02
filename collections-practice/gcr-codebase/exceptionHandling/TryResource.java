package exceptionHandling;

import java.io.*;

public class TryResource {

    public static void main(String[] args) {

        // Resource will close automatically
        try (BufferedReader br =
                     new BufferedReader(new FileReader("info.txt"))) {

            // Reading first line
            System.out.println(br.readLine());

        } catch (IOException e) {

            // If file problem
            System.out.println("Error reading file");
        }
    }
}
