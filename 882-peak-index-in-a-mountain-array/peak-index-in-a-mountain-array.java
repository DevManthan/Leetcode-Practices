class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int target = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > target){
                target = arr[i];
                index = i;
            }
            else{
                break;
            }
        }
        return index;
    }
}