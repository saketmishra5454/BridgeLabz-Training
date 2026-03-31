import java.util.*;

public class CheckEqualSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // equals method checks content not order
        boolean result = set1.equals(set2);

        System.out.println(result); // true
    }
}
