class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;
        for (int pile : piles) {
            if (pile > end)
                end = pile;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (CanWork(piles, mid, h)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    public boolean CanWork(int[] piles, int k, int h) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }
}