class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Based on typical LeetCode constraints (0 <= nums[i] <= 1000)
        boolean[] present = new boolean[1001];
        
        // Mark elements appearing in the first array
        for (int num : nums1) {
            present[num] = true;
        }
        
        // Temporary array to store matching intersections
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int size = 0;
        
        // Check elements from the second array
        for (int num : nums2) {
            if (present[num]) {
                temp[size++] = num;
                present[num] = false; // Prevents adding duplicates
            }
        }
        
        // Trim down to the final actual size
        int[] result = new int[size];
        System.arraycopy(temp, 0, result, 0, size);
        
        return result;
    }
}
