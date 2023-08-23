import java.util.*;
import java.io.*;

public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}