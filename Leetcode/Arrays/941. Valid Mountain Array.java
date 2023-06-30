class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;


        //Walk up
        while(i+1<n && arr[i]<arr[i+1])
            i++;


        //Starting and ending cannot be peak
        if(i == 0 || i == n-1)
            return false;
        
        //Walk Down
        while(i+1<n && arr[i]>arr[i+1])
            i++;
        
        return i == n-1;
    }
}