class Solution {
    static int isPerfectNumber(long N) {
        long sum = 0;
        for(int i=1; i<Math.sqrt(N);i++){
            if(N%i==0){
                sum += i;
                sum+=Math.floor(N/i);
            }
        }
        if(2*N==sum){
                return 1;
            }
        return 0;
    }
};