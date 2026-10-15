class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        
        // Traverse the string from left to right
        for (int i = 0; i < columnTitle.length(); i++) {
            // Shift the accumulated result to the next place value in base-26
            // and add the numeric value of the current character ('A' -> 1, 'B' -> 2, etc.)
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        
        return ans;
    }
}
