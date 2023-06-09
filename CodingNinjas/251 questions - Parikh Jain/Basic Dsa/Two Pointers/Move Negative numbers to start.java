public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
       int positive = 0;
       int runner = 0;
        
        while(runner<a.length){
            if(a[runner]<0 && positive<runner){
                if(a[positive]>0){
                    int temp = a[runner];
                    a[runner] = a[positive];
                    a[positive] = temp;
                    runner++;
                }
                positive++;
            }
            else{
                runner++;
            }
        }
        return a;
    }
}