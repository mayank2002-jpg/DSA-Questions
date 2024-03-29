import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n-1;

        while(mid<=high){
            if(arr.get(mid)==0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high,temp);

                high--;
            }
        }
    }
}
