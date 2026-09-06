class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return answer;

        int srow = 0;
        int erow = matrix.length - 1;
        int scol = 0;
        int ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            // 1. Top Row: Left to Right
            for (int j = scol; j <= ecol; j++) {
                answer.add(matrix[srow][j]);
            }
            srow++;

            // 2. Right Column: Top to Bottom
            for (int i = srow; i <= erow; i++) {
                answer.add(matrix[i][ecol]);
            }
            ecol--;

            // 3. Bottom Row: Right to Left (check if row still valid)
            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    answer.add(matrix[erow][j]);
                }
                erow--;
            }

            // 4. Left Column: Bottom to Top (check if col still valid)
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    answer.add(matrix[i][scol]);
                }
                scol++;
            }
        }
        return answer;
    }
}