class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int[] arr = image[i];
            int n = arr.length;
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int i = 0;i < image.length;i++){
            for(int j = 0;j < image[i].length;j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}