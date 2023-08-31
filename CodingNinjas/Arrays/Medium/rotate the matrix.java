import java.util.;
public class Solution {
    public static void rotateMatrix(int [][]mat){
        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; in; i++){
            for(int j = i+1; jm; j++){
                if(i!=j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i = 0; im; i++){
            int low = 0;
            int high = n-1;

            while(lowhigh){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}