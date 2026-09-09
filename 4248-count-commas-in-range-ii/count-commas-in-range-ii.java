class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long base = 1000L;

        while (base <= n) {
            totalCommas += (n - base + 1);
            
            // Overflow check before next multiplication
            if (base > Long.MAX_VALUE / 1000) {
                break;
            }
            base *= 1000L;
        }

        return totalCommas;
    }
}