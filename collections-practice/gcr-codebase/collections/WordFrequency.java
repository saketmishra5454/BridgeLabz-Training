import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        // lower case + remove punctuation using regex
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = text.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            if (freq.containsKey(w)) {
                freq.put(w, freq.get(w) + 1);
            } else {
                freq.put(w, 1);
            }
        }

        System.out.println(freq); 
    }
}
