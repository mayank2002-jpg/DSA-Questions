import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        
        int res[] = new int[2];
        res[0] = leftOcc(arr, n, k);
        res[1] = rightOcc(arr, n, k);
        return res;
        
    }
    
    public static int leftOcc(ArrayList<Integer> arr, int n, int k) {
        
        int s = 0, e = n-1;
        int ans = -1;
        while(s<=e) {
        int mid = s + (e-s)/2;
            if(arr.get(mid) == k) {
                ans = mid;
                e = mid - 1;
            }
            else if(k > arr.get(mid)) {
                s = mid + 1;
            }
            else if(k < arr.get(mid)) {
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public static int rightOcc(ArrayList<Integer> arr, int n, int k) {
        
        int s = 0, e = n-1;
        int ans1 = -1;
        while(s<=e) {
        int mid = s + (e-s)/2;
            if(arr.get(mid) == k) {
                ans1 = mid;
                s = mid + 1;
            }
            else if(k > arr.get(mid)) {
                s = mid + 1;
            }
            else if(k < arr.get(mid)) {
                e = mid - 1;
            }
        }
        return ans1;
    }

};