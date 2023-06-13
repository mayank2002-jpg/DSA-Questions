import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		int sum = 0;
		int n = mat.size();
		int m = mat.get(0).size();
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				if(mat.get(i).get(j)==0){
					if(i>=1 && mat.get(i-1).get(j)==1){
						sum++;
					}
					if(j<m-1 && mat.get(i).get(j+1)==1){
						sum++;
					}
					if(j>=1 && mat.get(i).get(j-1)==1){
						sum++;
					}
					if(i<n-1 && mat.get(i+1).get(j)==1){
						sum++;
					}
				}
			}
		}

		return sum;
	}
}
