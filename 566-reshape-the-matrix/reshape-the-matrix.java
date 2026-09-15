class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Agar total elements match nahi karte, original matrix return karo
        if (m * n != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        int total = m * n;

        for (int k = 0; k < total; k++) {
            // k / n, k % n -> original matrix ke coordinates
            // k / c, k % c -> new matrix ke coordinates
            reshaped[k / c][k % c] = mat[k / n][k % n];
        }

        return reshaped;
    }
}