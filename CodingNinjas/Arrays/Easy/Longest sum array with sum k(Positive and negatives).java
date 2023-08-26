import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		int n = nums.length;
		HashMap<Integer,Integer> preSum = new HashMap<>();
		int maxLen = 0;
		int sum = 0;

		for(int i = 0; i<n; i++){
			sum += nums[i];

			if(sum == k){
				maxLen = Math.max(maxLen, i+1);
			}

			int rem = sum-k;

			if(preSum.containsKey(rem)){
				int len = i-preSum.get(rem);
				maxLen = Math.max(maxLen, len);
			}

			if(!preSum.containsKey(sum)){
				preSum.put(sum, i);
			}
		}
		return maxLen;
	}
}