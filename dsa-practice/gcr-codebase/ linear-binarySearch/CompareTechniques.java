import java.io.*;
import java.util.concurrent.TimeUnit;

public class CompareTechniques {

    public static void main(String[] args) {

        // ============================================
        // PART 1: StringBuilder vs StringBuffer
        // ============================================
        String word = "hello";
        int iterations = 1_000_000;

        // ---- Test StringBuilder ----
        StringBuilder sbuilder = new StringBuilder();
        long sbStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(word);
        }
        long sbEnd = System.nanoTime();
        long sbTime = sbEnd - sbStart;

        // ---- Test StringBuffer ----
        StringBuffer sbuffer = new StringBuffer();
        long sbfStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(word);
        }
        long sbfEnd = System.nanoTime();
        long sbfTime = sbfEnd - sbfStart;

        System.out.println("===== String Concatenation Results =====");
        System.out.println("StringBuilder Time: " + formatTime(sbTime));
        System.out.println("StringBuffer  Time: " + formatTime(sbfTime));
        System.out.println((sbTime < sbfTime ? "→ StringBuilder is faster" : "→ StringBuffer is faster") + "\n");


        // ============================================
        // PART 2: FileReader vs InputStreamReader
        // ============================================
        String filePath = "large.txt"; // supply your own large file (e.g., 100MB)

        // ---- Test FileReader ----
        long frStart = System.nanoTime();
        int frWords = countWordsUsingFileReader(filePath);
        long frEnd = System.nanoTime();
        long frTime = frEnd - frStart;

        // ---- Test InputStreamReader ----
        long isrStart = System.nanoTime();
        int isrWords = countWordsUsingInputStreamReader(filePath);
        long isrEnd = System.nanoTime();
        long isrTime = isrEnd - isrStart;

        System.out.println("===== File Reading Results =====");
        System.out.println("FileReader         → Words: " + frWords + " Time: " + formatTime(frTime));
        System.out.println("InputStreamReader  → Words: " + isrWords + " Time: " + formatTime(isrTime));

        if (frTime < isrTime)
            System.out.println("→ FileReader is faster for this test.");
        else
            System.out.println("→ InputStreamReader is faster for this test.");
    }


    // ==========================================================
    // Helper method: Count words using FileReader
    // ==========================================================
    public static int countWordsUsingFileReader(String filePath) {
        int count = 0;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {}
        }
        return count;
    }


    // ==========================================================
    // Helper method: Count words using InputStreamReader
    // ==========================================================
    public static int countWordsUsingInputStreamReader(String filePath) {
        int count = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (isr != null) isr.close();
                if (fis != null) fis.close();
            } catch (IOException e) {}
        }
        return count;
    }


    // ==========================================================
    // Time formatting helper (nanoseconds → readable format)
    // ==========================================================
    private static String formatTime(long nanos) {
        return TimeUnit.MILLISECONDS.convert(nanos, TimeUnit.NANOSECONDS) + " ms (" + nanos + " ns)";
    }
}
