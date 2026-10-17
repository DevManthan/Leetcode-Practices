import java.util.Arrays;
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // This array will store the smallest tail of all increasing subsequences
        int[] tails = new int[nums.length];
        int size = 0; // Tracks the length of the longest increasing subsequence
        
        for (int x : nums) {
            // Binary search to find the correct insertion position for x
            int i = 0, j = size;
            while (i < j) {
                int mid = (i + j) / 2;
                if (tails[mid] < x) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            
            // Update the tails array
            tails[i] = x;
            
            // If x is larger than all current elements, expand the subsequence length
            if (i == size) {
                size++;
            }
        }
        
        return size;
    }
}