import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		Arrays.sort(arr);
		int i = 0;
		while(i<n && arr[i]<=0)
			i++;
			int j = 1;
			while(i<n && arr[i]==j){
				i++;
				j++;
			}	
		return j;
	}
}
