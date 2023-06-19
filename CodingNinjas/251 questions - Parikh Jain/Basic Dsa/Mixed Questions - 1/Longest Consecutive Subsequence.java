import java.io.*;
import java.util.*;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if(arr.length == 0 || arr==null){
            return 0;
        }
        Arrays.sort(arr);
        int ans = 1;
        int prev = arr[0];
        int cur = 1;
        for(int i = 1;i<arr.length;i++){
        if(arr[i]==prev+1){
        cur++;
    }
        else if(arr[i]!=prev){
            cur=1;
    }
        prev=arr[i];
        ans = Math.max(ans,cur);
        }
        return ans;
    }
}