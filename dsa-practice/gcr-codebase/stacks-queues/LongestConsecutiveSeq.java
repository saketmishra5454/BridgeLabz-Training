import java.util.*;

public class LongestConsecutiveSeq {

    // find longest consec seq using hashset for O(n)
    public static int longestSeq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int best = 0;

        for (int x : set) {
            // only start counting when x is start of seq (x-1 not exist)
            if (!set.contains(x - 1)) {
                int len = 1;
                int cur = x;
                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                best = Math.max(best, len); // update if longer seq
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSeq(nums)); // answer should be 4
    }
}
