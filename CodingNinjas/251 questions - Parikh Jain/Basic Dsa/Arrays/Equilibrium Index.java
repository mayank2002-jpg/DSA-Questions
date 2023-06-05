import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		int n = arr.length;
		int totalSum = 0;
		int leftSum = 0;
		
		for(int i = 0; i<n;i++){
			totalSum += arr[i];
		}
		
		for(int i = 0;i<n;i++){
			totalSum -= arr[i];

			if(leftSum == totalSum){
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}
}