class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Step 1: Pack pairs of numbers into the second half of the array
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = nums[i + n];
            
            // Shift y by 10 bits and combine it with x using bitwise OR
            nums[i + n] = (y << 10) | x;
        }
        
        // Step 2: Unpack the numbers into their final correct positions
        int index = 0;
        for (int i = n; i < 2 * n; i++) {
            // Extract x (lower 10 bits)
            int x = nums[i] & 1023; 
            // Extract y (upper 10 bits)
            int y = nums[i] >> 10;   
            
            nums[index] = x;
            nums[index + 1] = y;
            index += 2;
        }
        
        return nums;
    }
}
