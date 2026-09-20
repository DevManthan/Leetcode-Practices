class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Get character at current 0-indexed position
            char c = s.charAt(i);
            
            // Calculate reversed alphabet position ('a' -> 26, 'b' -> 25, etc.)
            int revVal = 26 - (c - 'a');
            
            // Problem requires 1-indexed string positions, so multiply by (i + 1)
            totalSum += revVal * (i + 1);
        }
        
        return totalSum;
    }
}
