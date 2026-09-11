class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Loop as long as there are digits in 'num' OR 'k' has a value left to add
        while (i >= 0 || k > 0) {
            // Add the current digit of num to k if we haven't run out of digits
            if (i >= 0) {
                k += num[i];
                i--;
            }
            
            // The last digit of k is the value for the current position
            result.add(k % 10);
            
            // Divide k by 10 to carry over the remaining value to the next position
            k /= 10;
        }

        // Since we added digits from right to left, reverse the list to get the correct order
        Collections.reverse(result);
        return result;
    }
}