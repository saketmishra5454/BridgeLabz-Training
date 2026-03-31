public class StringConcatPerformance {

    public static void main(String[] args) {

        int N = 1_000_000; // 1 million concatenations
        String word = "a";

        System.out.println("===== String Concatenation Performance Test =====\n");

        // -------------------------------------------------
        // 1. Test with String (Immutable, O(N^2))
        // -------------------------------------------------
        long startString = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += word; // slow due to immutability
        }
        long endString = System.currentTimeMillis();
        System.out.println("String Time      : " + (endString - startString) + " ms");


        // -------------------------------------------------
        // 2. Test with StringBuilder (Mutable, O(N))
        // -------------------------------------------------
        long startBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(word);
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ms");


        // -------------------------------------------------
        // 3. Test with StringBuffer (Thread-safe, O(N))
        // -------------------------------------------------
        long startBuffer = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append(word);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Time : " + (endBuffer - startBuffer) + " ms");
    }
}
