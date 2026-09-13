import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int maxOfRowMins = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int minInRow = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minInRow = Math.min(minInRow, matrix[i][j]);
            }
            maxOfRowMins = Math.max(maxOfRowMins, minInRow);
        }
        
        int minOfColMaxs = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int maxInCol = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxInCol = Math.max(maxInCol, matrix[i][j]);
            }
            minOfColMaxs = Math.min(minOfColMaxs, maxInCol);
        }
        
        List<Integer> result = new ArrayList<>();
        if (maxOfRowMins == minOfColMaxs) {
            result.add(maxOfRowMins);
        }
        
        return result;
    }
}
