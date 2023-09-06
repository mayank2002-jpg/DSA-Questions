public class Solution {
    public static int count(int arr[], int n, int x) {
        int xStartIndex, xEndIndex;

        xStartIndex = firstOccurrence(arr, n, x);
        if (xStartIndex == -1)
            return 0;

        xEndIndex = lastOccurrence(arr, n, x);
        int count =  xEndIndex - xStartIndex + 1;

        return count;
    }
    private static int firstOccurrence(int arr[], int n, int x) {

        int startIndex = 0, endIndex = n - 1;

        int xStartIndex = -1;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if(arr[mid] >= x) {
                if(arr[mid] == x) {
                    xStartIndex = mid;
                }
                endIndex = mid - 1;
            }
            else {
                startIndex = mid + 1;
            }
        }
        return xStartIndex;
    }

    private static int lastOccurrence(int arr[], int n, int x) {

        int startIndex = 0, endIndex = n - 1;

        int xEndIndex = -1;

        while (startIndex <= endIndex)
        {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if(arr[mid] > x)
            {
                endIndex = mid - 1;
            }
            else
            {
                if(arr[mid] == x)
                    xEndIndex = mid;

                startIndex = mid + 1;
            }
        }
        return xEndIndex;
    }
}