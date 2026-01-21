import java.util.*;

public class SlidingWindowMax {

    // function to get max in every window of k size (use deque for keep indexes)
    public static List<Integer> maxSliding(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); // store index not values!

        for (int i = 0; i < arr.length; i++) {

            // remove out of window elements from front
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // remove smaller values from back because they are useless
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // starting adding to result when i>=k-1 (becoz first window finish here)
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> ans = maxSliding(nums, k);

        // printing the ans (might not look good lol)
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
