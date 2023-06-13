import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
       boolean check = true;
       for(int i = 0;i<matrix.length;i++){
           check = true;
           for(int j = 0; j<matrix.length;j++){
               if(matrix[i][j]!=matrix[j][i]){
                   check = false;
                   
                   return check;
               }
           }
       }
       return check;
    }
}