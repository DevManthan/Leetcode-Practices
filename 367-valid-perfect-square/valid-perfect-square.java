class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num / 2;
        if (num < 2) {
            return true;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid > num / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}