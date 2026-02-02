package javaStreams;

import java.io.*;

public class UserInfoSave {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            FileWriter fw = new FileWriter("user.txt");

            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter Age: ");
            String age = br.readLine();

            System.out.print("Enter Favorite Language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + lang + "\n");

            fw.close();

            System.out.println("Data saved successfully");

        } catch (IOException e) {
            System.out.println("Error in input/output");
        }
    }
}
