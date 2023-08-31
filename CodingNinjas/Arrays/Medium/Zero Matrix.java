import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i = 0; i<n; i++){
            ArrayList<Integer> arrayList = matrix.get(i);

            for(int j = 0; j<m; j++){
                if(arrayList.get(j)==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0; i<n; i++){
            ArrayList<Integer> arrayList = matrix.get(i);
            for(int j=0; j<m;j++){
                if(rows[i]==1 || cols[j]==1){
                    arrayList.set(j,0);
                }
            }
        }
        return matrix;
    }
}