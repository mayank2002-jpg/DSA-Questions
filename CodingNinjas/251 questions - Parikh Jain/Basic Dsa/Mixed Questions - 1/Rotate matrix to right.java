import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		int[][] result = new int[n][m];
		
		if(k==0){
			return mat;
		}
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				int colnum = (((j+k)-m)%m);
				for(int row = 0;row<n;row++){
					result[row][colnum] = mat[row][j];
				}
			}
		}
		return result;
	}
}