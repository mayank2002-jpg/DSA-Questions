public class Solution {
    public static int[] alternateNumbers(int []a) {
       int n = a.length;
        int pos = 0;
        int neg = 1;
        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            if(a[i]>0){
                ans[pos] = a[i];
                pos+=2;
            }
            else{
                ans[neg]=a[i];
                neg+=2;
            }
        }
        return ans;
    }
}