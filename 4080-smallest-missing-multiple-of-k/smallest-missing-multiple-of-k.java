class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int j = 1;
        
        while(true){
        int target = k*j;
        boolean found = false;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == k*j){
                    found = true;
                    break;
                }
            }
            if(!found){
                return target;
            }
            j++;

        }
    }
}