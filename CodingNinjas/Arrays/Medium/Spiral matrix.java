import java.util.*;

public class Solution {

    public static int[] spiralMatrix(int[][] MATRIX) {

        int n = MATRIX.length;

        int m = MATRIX[0].length;

        int[] ans = new int[n * m];

        int top = 0, bottom = n - 1;

        int left = 0, right = m - 1;

        int k = 0;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {

                ans[k++] = MATRIX[top][i];

            }

            top++;

            for (int i = top; i <= bottom; i++) {

                ans[k++] = MATRIX[i][right];

            }

            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--) {

                    ans[k++] = MATRIX[bottom][i];

                }

                bottom--;

            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {

                    ans[k++] = MATRIX[i][left];

                }

                left++;

            }

        }

        return ans;

    }

}