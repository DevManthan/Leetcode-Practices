class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Check 4 times (0, 90, 180, and 270 degrees)
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            // Rotate 90 degrees clockwise in-place
            rotate90Clockwise(mat);
        }
        return false;
    }

    private void rotate90Clockwise(int[][] mat) {
        int n = mat.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
