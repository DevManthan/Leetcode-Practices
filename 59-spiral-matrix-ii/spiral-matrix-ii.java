class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0) return matrix;

        int srow = 0;
        int erow = matrix.length - 1;
        int scol = 0;
        int ecol = matrix[0].length - 1;
        int st = 1;
        while (st <= n*n) {
            // 1. Top Row: Left to Right
            for (int j = scol; j <= ecol; j++) {
                matrix[srow][j] = st;
                st++;
            }
            srow++;

            // 2. Right Column: Top to Bottom
            for (int i = srow; i <= erow; i++) {
                matrix[i][ecol] = st;
                st++;
            }
            ecol--;

            // 3. Bottom Row: Right to Left (check if row still valid)
            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    matrix[erow][j] = st;
                    st++;
                }
                erow--;
            }

            // 4. Left Column: Bottom to Top (check if col still valid)
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    matrix[i][scol] = st;
                    st++;
                }
                scol++;
            }
        }
        return matrix;
    }
}