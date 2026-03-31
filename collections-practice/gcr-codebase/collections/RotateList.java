import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2; // this means shift left by 2

        // doing mod so that large rotations not cause prob
        int k = rotateBy % nums.size();

        // taking new list to put answer
        List<Integer> result = new ArrayList<>();

        // first putting from k index to end
        for (int i = k; i < nums.size(); i++) {
            result.add(nums.get(i));
        }

        // now put the first part
        for (int i = 0; i < k; i++) {
            result.add(nums.get(i));
        }

        System.out.println(result);
    }
}
