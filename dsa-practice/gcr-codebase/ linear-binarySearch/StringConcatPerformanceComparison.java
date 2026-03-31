
public class StringConcatPerformanceComparison {

    public static void main(String[] args) {

        int iterations = 1_000_000; // 1 million
        String text = "hello";

        // ------------ Test StringBuffer ------------
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;


        // ------------ Test StringBuilder ------------
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;


        // ------------ Results ------------
        System.out.println("Time taken by StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder : " + builderTime + " ns");

        if (bufferTime > builderTime) {
            System.out.println("\nStringBuilder is faster in this test.");
        } else {
            System.out.println("\nStringBuffer is faster in this test (uncommon due to synchronization).");
        }
    }
}
