class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = index[i];
            // Agar index current filled boundary se pehle hai, toh elements right shift karo
            if (idx < i) {
                System.arraycopy(target, idx, target, idx + 1, i - idx);
            }
            target[idx] = nums[i];
        }

        return target;
    }
}