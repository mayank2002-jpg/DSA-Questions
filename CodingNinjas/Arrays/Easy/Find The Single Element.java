public class Solution {
    public static int getSingleElement(int []arr){
        int xorr = 0;
        
        for(int i = 0; i<arr.length; i++){
            xorr = xorr^arr[i];
        }
        return xorr;
    }
}