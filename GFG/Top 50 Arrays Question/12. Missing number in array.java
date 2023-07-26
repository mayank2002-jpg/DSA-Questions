class Solution {
    int missingNumber(int array[], int n) {
        int reqSum = (n*(n+1))/2;
        int currSum = 0;
        for(int i = 0; i<array.length; i++){
            currSum += array[i];
        }
        return reqSum-currSum;
    }
}