class Search_Elements {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        // for(int i = 0;i<=nums.length-1;i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
            
        
        
            while(low <= high){
                int mid = low+(high-low)/2;
                if(nums[mid]== target){
                    return mid;
                }
                else if(nums[mid]>target){
                    high = mid-1;
                
                }
                else{
                    low = mid +1;
                }
            }
            return low;

        }

        public static void main(String[] args) {
            Search_Elements se = new Search_Elements();
            int[] nums = {1,3,5,6};
            int target = 5;
            int index = se.searchInsert(nums, target);
            System.out.println("Index: " + index);
        }
        
    }
