public class Solution
{
    public static int[] recursion(int x, int[] arr, int index) {
        if(x==0)
        return arr;
        arr[index] = x;
        return recursion(x-1, arr, index+1);
    }
    
    public static int[] printNos(int x){
        int[] arr = new int[x];
        return recursion(x, arr, 0);
    }
    
}