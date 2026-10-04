class Solution {
    public int maxValue(int n, int index, int maxSum) {
        
        maxSum -=n;

        int left = 0, right = maxSum;
        while(left < right){
            int mid = (left + right + 1) / 2;
            if(ispossible(mid, index, n, maxSum)){
                left = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return left + 1;
    }
    public boolean ispossible(int peak, int index, int n, int sum){
        long left = Math.max(peak-index, 0);
        long result = (peak + left) * (peak - left + 1) / 2;
        long right = Math.max(peak - ((n-1) - index), 0);
        result += (peak + right) * (peak - right + 1) / 2;
        return (result - peak <= sum);
    }
}