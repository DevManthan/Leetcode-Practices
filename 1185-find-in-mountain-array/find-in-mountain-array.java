/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);
        int index1 = BinarySearch(mountainArr, target, 0, peak, true);
        int index2 = BinarySearch(mountainArr, target, peak, mountainArr.length() - 1, false);

        if (index1 != -1) {
            return index1;
        }
        return index2;
    }

    public int findPeak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (end > start) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int BinarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int midVal = arr.get(mid);
            if (midVal == target) {
                return mid;
            }
            if (isAsc) {
                if (midVal > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (midVal < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}