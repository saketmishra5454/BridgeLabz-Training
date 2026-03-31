package javaStreams;

import java.io.*;

public class BufferedVsNormalCopy {

    public static void main(String[] args) {

        String source = "bigfile.txt";
        String dest1 = "normalCopy.txt";
        String dest2 = "bufferedCopy.txt";

        copyNormal(source, dest1);
        copyBuffered(source, dest2);
    }

    // Normal stream copy
    public static void copyNormal(String src, String dest) {

        try {

            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);

            byte[] buffer = new byte[4096];

            int bytes;
            long start = System.nanoTime();

            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }

            long end = System.nanoTime();

            System.out.println("Normal Copy Time: " + (end - start));

            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Error in normal copy");
        }
    }

    // Buffered stream copy
    public static void copyBuffered(String src, String dest) {

        try {

            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(src));

            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(dest));

            byte[] buffer = new byte[4096];

            int bytes;
            long start = System.nanoTime();

            while ((bytes = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytes);
            }

            long end = System.nanoTime();

            System.out.println("Buffered Copy Time: " + (end - start));

            bis.close();
            bos.close();

        } catch (IOException e) {
            System.out.println("Error in buffered copy");
        }
    }
}
