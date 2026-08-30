class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int leftAns = -1;
        int rightAns = -1;

        // Loop 1: Find the first (leftmost) occurrence
        while (start <= end) {
            int mid1 = start + (end - start) / 2;
            if (nums[mid1] < target) {
                start = mid1 + 1;
            } else if (nums[mid1] > target) {
                end = mid1 - 1;
            } else {
                leftAns = mid1;  // Record the potential answer
                end = mid1 - 1;  // Keep looking left
            }
        }

        // Reset pointers for the second search
        start = 0;
        end = nums.length - 1;

        // Loop 2: Find the last (rightmost) occurrence
        while (start <= end) {
            int mid2 = start + (end - start) / 2;
            if (nums[mid2] < target) {
                start = mid2 + 1;
            } else if (nums[mid2] > target) {
                end = mid2 - 1;
            } else {
                rightAns = mid2; // Record the potential answer
                start = mid2 + 1; // Keep looking right
            }
        }

        return new int[]{leftAns, rightAns};
    }
}
