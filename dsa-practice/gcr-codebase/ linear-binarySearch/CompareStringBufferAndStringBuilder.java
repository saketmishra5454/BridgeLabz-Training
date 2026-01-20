public class CompareStringBufferAndStringBuilder {

    public static void main(String[] args) {

        int iterations = 1_000_000; // 1 million
        String text = "hello";

        // ----------- Test StringBuffer -----------
        StringBuffer sbf = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;


        // ----------- Test StringBuilder -----------
        StringBuilder sbd = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbd.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;


        // ----------- Results -----------
        System.out.println("Time taken by StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder : " + builderTime + " ns");

        System.out.println("\nConclusion: "
                + (builderTime < bufferTime ? "StringBuilder is faster." : "StringBuffer is faster."));
    }
}
