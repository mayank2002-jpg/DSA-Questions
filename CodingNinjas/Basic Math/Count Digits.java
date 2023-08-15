public class Solution {
    public static int countDigits(int n){
        int cnt = 0;
        int temp = n;
        while(temp>0){
           int x = temp%10;
           if(x>0 && n%x == 0){
               cnt++;
           }
            temp /= 10;
        }
        return cnt;
    }
}