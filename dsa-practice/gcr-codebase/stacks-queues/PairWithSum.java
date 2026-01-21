import java.util.*;

public class PairWithSum {

    // check if target sum exists by storing visited numbers
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {
            int need = target - x;
            if (seen.contains(need)) return true;
            seen.add(x); // remember we seen x
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        int target = 17;

        System.out.println(hasPair(nums, target)); // true
    }
}
