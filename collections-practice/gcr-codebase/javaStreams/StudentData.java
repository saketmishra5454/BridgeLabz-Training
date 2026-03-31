package javaStreams;

import java.io.*;

public class StudentData {

    public static void main(String[] args) {

        try {

            DataOutputStream dos =
                    new DataOutputStream(new FileOutputStream("stud.dat"));

            dos.writeInt(101);
            dos.writeUTF("Saket");
            dos.writeDouble(8.5);

            dos.close();

            DataInputStream dis =
                    new DataInputStream(new FileInputStream("stud.dat"));

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println(roll);
            System.out.println(name);
            System.out.println(gpa);

            dis.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
