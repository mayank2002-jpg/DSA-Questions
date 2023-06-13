import java.util.*;
import java.io.*;

public class Solution {

	public static void inplaceRotate(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int row = 0; row<n/2;row++){
			for(int col = 0;col<n;col++){
				int temp = arr[row][col];
				arr[row][col] = arr[n-1-row][col];
				arr[n-1-row][col] = temp;
			}
		}
	}

}