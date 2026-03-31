package javaStreams;
import java.io.*;

public class ImageToByte {

    public static void main(String[] args) {

        try {

            FileInputStream fis =
                    new FileInputStream("photo.jpg");

            ByteArrayOutputStream baos =
                    new ByteArrayOutputStream();

            int ch;

            while ((ch = fis.read()) != -1) {
                baos.write(ch);
            }

            byte[] data = baos.toByteArray();

            ByteArrayInputStream bais =
                    new ByteArrayInputStream(data);

            FileOutputStream fos =
                    new FileOutputStream("copy.jpg");

            while ((ch = bais.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("Image copied");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
