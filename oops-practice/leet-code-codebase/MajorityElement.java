import java.util.Arrays;

class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(sol.majorityElement(nums1)); // Output: 3
        System.out.println(sol.majorityElement(nums2)); // Output: 2
    }
}
