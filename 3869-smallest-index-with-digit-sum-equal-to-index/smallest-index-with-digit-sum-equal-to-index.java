class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(sum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    public int sum(int n){
        int s = 0;
        while(n != 0){
            int rem = n % 10;
            s += rem;
            n /= 10;
        }
        return s;
    }
}