class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;

        for (int[] row : image) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;

                start++;
                end--;
            }
        }
        return image;
    }
}