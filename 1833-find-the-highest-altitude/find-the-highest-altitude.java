class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int current = 0;
        for(int num : gain){
           current += num;
           res = Math.max(current, res);
        }
        return res;
    }
}