public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int res[] = new int[2];
        int largest = a[0];
        int sLargest = -1;

        for(int i = 0; i<n; i++){
            if(a[i]>largest){
                sLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>sLargest){
                sLargest = a[i];
            }
        }
        res[0] = sLargest;
        int smallest = a[0];
        int sSmallest = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(a[i]<smallest){
                sSmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]<sSmallest && a[i]!= smallest){
                sSmallest = a[i];
            }
        }
        res[1] = sSmallest;
        
        return res;
    }
}