// Leetcode Problem No - 01 (Two Sum)


import java.util.*;
public class TwoSum{

   //twoSum method taking two parameters nums array and a target element that is being searched into array
   public int[] twoSum(int[] nums, int target) {
       //Taking a HashMap key value data structure 
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] ans = new int[2];        // in this ans Array we store the index of both element whose sum equals to target
       for(int i = 0;i<nums.length;i++){
           if(map.containsKey(target-nums[i])){ // Checking if map containing the value target - current element
              ans[0] = i;              // puting the index in ans array
              ans[1] = map.get(target-nums[i]);
              break;
           }
           map.put(nums[i],i);
       }
       return ans;
   }
}