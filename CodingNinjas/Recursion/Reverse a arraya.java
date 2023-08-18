public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        return helper(0,n-1,nums);

    }
    public static int[] helper(int start, int end, int arr[]){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return helper(start+1, end-1, arr);
        }
        return arr;
    }
}