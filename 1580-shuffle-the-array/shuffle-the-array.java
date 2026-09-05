class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            // First half elements (x) go to even indices: 0, 2, 4...
            ans[2 * i] = nums[i];
            
            // Second half elements (y) go to odd indices: 1, 3, 5...
            ans[2 * i + 1] = nums[i + n];
        }
        
        return ans;  
    }
}
