public class MaximumSubarray {

    // Function to find maximum sum subarray
    public static int maxSubArray(int[] nums) {
        // Initialize current and max sum as first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Loop from 2nd element
        for (int i = 1; i < nums.length; i++) {
            // Kadane logic: choose max of current element or add to subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update overall max
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));  // Output: 6
        System.out.println(maxSubArray(nums2)); // Output: 23
    }
}
