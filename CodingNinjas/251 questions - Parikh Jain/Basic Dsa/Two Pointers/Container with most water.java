public class Solution {

	public static int maxArea(int[] height) {
	    int ans = 0;
		int i = 0, j = height.length-1;
		while(i<j){
			int mini = Math.min(height[i],height[j]);
			ans = Math.max(ans,mini*(j-i));

			if(height[i]<=mini && i<j){
				i++;
			}
			if(height[j]<=mini && i<j){
				j--;
			}
		}
		return ans;
	}
}