import java.util.*;
import java.io.*;

public class Solution {
    public static void sort012(int[] arr)
    {
        int one = 0, zero = 0, two = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i<zero){
                arr[i]=0;
            }
            else if(i<one+zero){
                arr[i] = 1;
            }
            else{
                arr[i]=2;
            }
        }
    }
}