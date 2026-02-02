package javaStreams;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("text.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String w : words) {

                    w = w.toLowerCase();

                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else {
                        map.put(w, 1);
                    }
                }
            }

            br.close();

            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 Words:");

            for (int i = 0; i < 5 && i < list.size(); i++) {

                System.out.println(list.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
