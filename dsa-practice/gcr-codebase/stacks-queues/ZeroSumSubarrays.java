import java.util.*;

public class ZeroSumSubarrays {

    // find subarrays which sums to zero using hashmap of prefix sum
    public static List<int[]> getZeroSumSubarrays(int[] arr) {
        List<int[]> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // for sum=0 from start we add index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    res.add(new int[]{startIdx + 1, i});
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 1, 2, -1, 2, -2};
        List<int[]> ans = getZeroSumSubarrays(nums);

        for (int[] p : ans) {
            System.out.println("Subarr from " + p[0] + " to " + p[1]);
        }
    }
}
