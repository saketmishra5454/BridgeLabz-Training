import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        // going through list
        for (Integer n : nums) {
            if (!seen.contains(n)) { // if not seen before
                ans.add(n);
                seen.add(n);
            }
        }

        System.out.println(ans);
    }
}
