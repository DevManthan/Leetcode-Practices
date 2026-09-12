class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        // Flags to track if the rotation is still valid
        boolean rot0 = true;
        boolean rot90 = true;
        boolean rot180 = true;
        boolean rot270 = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                
                // Check 0 degrees
                if (val != target[i][j]) rot0 = false;
                
                // Check 90 degrees clockwise
                if (val != target[j][n - 1 - i]) rot90 = false;
                
                // Check 180 degrees
                if (val != target[n - 1 - i][n - 1 - j]) rot180 = false;
                
                // Check 270 degrees clockwise
                if (val != target[n - 1 - j][i]) rot270 = false;
                
                // Early exit: if all rotations become invalid, stop checking immediately
                if (!rot0 && !rot90 && !rot180 && !rot270) {
                    return false;
                }
            }
        }
        
        // If at least one rotation holds true for the entire matrix, return true
        return rot0 || rot90 || rot180 || rot270;
    }
}
