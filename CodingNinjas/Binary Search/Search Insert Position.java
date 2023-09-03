public class Solution {
    public static int searchInsert(int [] arr, int m){
        int n = arr.length;
        int low = 0, high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==m){
                return mid;
            }
            else if(arr[mid]<m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}