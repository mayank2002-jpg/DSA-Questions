import java.util.* ;
import java.io.*; 
public class Solution {

    static int findFloor(int n, int x, int[] arr){
        int low = 0, high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }
            else{
                  high = mid-1;
            }
        }
        return ans;
    }

      static int findCeil(int n, int x,int[] arr){
        int low = 0, high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid-1;
            }
            else{
                  low = mid+1;
            }
        }
        return ans;
    }
    
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int f = findFloor(n, x,arr);
        int c = findCeil(n, x,arr);
        System.out.print(f+" ");
        return c;
    }
}