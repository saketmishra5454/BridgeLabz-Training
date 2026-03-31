import java.util.*;

public class TwoSum {

    // returns indices of 2 numbers adding to target (easy hashmap trick)
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // val -> idx

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; // no ans found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ans = twoSum(nums, 9);

        System.out.println(ans[0] + " " + ans[1]); // 0 1
    }
}
