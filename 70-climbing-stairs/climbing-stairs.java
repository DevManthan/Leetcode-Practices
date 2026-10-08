class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 1) {
            return 1;
        }
        
        // Variables to store the number of ways for the last two steps
        int prev2 = 1; // Ways to reach step 0
        int prev1 = 1; // Ways to reach step 1
        int current = 0;
        
        // Iteratively compute ways up to step n
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // Sum of the previous two steps
            prev2 = prev1;          // Shift prev2 forward
            prev1 = current;        // Shift prev1 forward
        }
        
        return current;
    }
}
