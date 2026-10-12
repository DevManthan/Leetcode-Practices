class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;
        for (int w : weights) {
            start = Math.max(start, w); // Minimum capacity is the heaviest package
            end += w;                   // Maximum capacity is the sum of all packages
        }
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (canShip(weights, mid, days)) {
                end = mid; // Try for a smaller capacity
            } else {
                start = mid + 1; // Need a larger capacity
            }
        }
        return start;
    }
    
    private boolean canShip(int[] weights, int capacity, int days) {
        int currentLoad = 0;
        int requiredDays = 1;
        
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = w;
                if (requiredDays > days) {
                    return false;
                }
            } else {
                currentLoad += w;
            }
        }
        return true;
    }
}
