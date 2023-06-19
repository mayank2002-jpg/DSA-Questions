public class Solution {
    public static int maxSubarraySum(int[] arr, int n) {
        int sum = 0;
        int tempmax = 0;
        int max = Integer.MIN_VALUE;
        int tempmin = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0;i<n;i++){
            sum += arr[i];
            tempmax += arr[i];
            max = Math.max(tempmax, max);
            
            if(tempmax<0){
                tempmax = 0;
            }
            
            tempmin+=arr[i];
            min = Math.min(tempmin, min);
            if(tempmin>0){
                tempmin=0;
            }
        }
        if(min == sum){
            return max;
        }
        return Math.max(max,sum-min);
    }
}
