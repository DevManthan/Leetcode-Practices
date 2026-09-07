class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 0;i < gain.length;i++){
           arr[i+1] = arr[i] + gain[i];
        }
        for(int num : arr){
           res = Math.max(res, num);
        }
        return res;
    }
}