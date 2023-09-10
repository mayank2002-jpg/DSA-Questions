public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] A, int k) {
        int n = A.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == k)
                return true;
            if (A[low] == A[mid] && A[mid] == A[high]) {
                low = mid + 1;
                high = mid - 1;
                continue;
            }

            if (A[low] <= A[mid]) {
                if (A[low] <= k && k <= A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] <= k && k <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return false;
    }
}