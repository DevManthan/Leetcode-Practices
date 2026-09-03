class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            return BinarySearch(nums, target, 0, nums.length-1);
        }
        if(target == nums[pivot]){
            return pivot;
        }
        if(target >= nums[0]){
            return BinarySearch(nums, target, 0, pivot);
        }
        return BinarySearch(nums, target, pivot+1, nums.length-1);
    }
    public int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
        int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
        int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}