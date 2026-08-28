class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int[] nums : accounts){
            int sum = 0;
            for(int num : nums){
                sum = sum + num;
            }
            if(maxSum < sum)
                maxSum = sum;
        }
        return maxSum;
    }
}