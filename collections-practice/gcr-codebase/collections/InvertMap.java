import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String key = e.getKey();
            Integer value = e.getValue();

            // if key (value side now) already exists just add into list
            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        System.out.println(inverted); 
    }
}
