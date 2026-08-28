class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int[] nums : accounts){
            int sum = 0;
            for(int num : nums){
                sum += num;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}