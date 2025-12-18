class removeElement{
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;

        for(int i = 0; i<n;i++) {
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++; 
            }
        }
        return k;
    }

        public static void main(String[] args) {
            removeElement re = new removeElement();
            int[] nums = {3,2,2,3};
            int val = 3;
            int k = re.removeElement(nums, val);
            System.out.println("New length: " + k);
            System.out.print("Modified array: ");
            for(int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }




        }    }  
