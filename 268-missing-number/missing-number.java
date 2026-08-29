class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        for(int num : nums){
            sum += num;
        }

        return actualSum - sum;
    }
}