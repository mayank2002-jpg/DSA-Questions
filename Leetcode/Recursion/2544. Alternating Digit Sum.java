class Solution {

    private int numLen(int num){
        int index = 0;
        while(num>0){
            index++;
            num/=10;
        }
        return index;
    }

    public int alternateDigitSum(int n) {
        int res = 0;
        if(n<=0){
            return res;
        }
        if(numLen(n)%2 != 0){
            res += n%10;
        }
        else{
            res -= n%10;
        }
        return alternateDigitSum(n/10) + res;
    }
}