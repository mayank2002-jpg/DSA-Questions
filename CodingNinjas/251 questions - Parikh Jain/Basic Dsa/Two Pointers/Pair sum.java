import java.util.*;
import java.io.*;

public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        int cnt = 0;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                cnt++;
                i++;
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        if (cnt == 0) {
            return -1;
        } else {
            return cnt;
        }
    }
}