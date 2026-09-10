class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += mat[i][i];
            
            // Secondary diagonal
            sum += mat[i][n - 1 - i];
        }

        // Agar odd dimension hai, center element do baar jud chuka hai
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}