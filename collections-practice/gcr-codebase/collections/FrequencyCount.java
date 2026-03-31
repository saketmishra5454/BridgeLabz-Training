import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> freq = new HashMap<>();

        // loop to count each word
        for (String s : items) {
            if (freq.containsKey(s)) {
                freq.put(s, freq.get(s) + 1); // if already there increase
            } else {
                freq.put(s, 1); // if not present put 1
            }
        }

        System.out.println(freq);
    }
}
