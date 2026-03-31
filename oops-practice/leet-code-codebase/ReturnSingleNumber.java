class ReturnSingleNumber {

    public int singleNumber(int[] nums) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        ReturnSingleNumber sol = new ReturnSingleNumber();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(sol.singleNumber(nums1)); // Output: 1
        System.out.println(sol.singleNumber(nums2)); // Output: 4
        System.out.println(sol.singleNumber(nums3)); // Output: 1
    }
}
