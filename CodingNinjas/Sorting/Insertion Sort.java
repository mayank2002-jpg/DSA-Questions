public class Solution {
    public static void insertionSort(int[] arr, int size) {
       for(int i = 1; i<arr.length; i++){
           int j = i;
           while(j>0 && arr[j]<arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;

               j--;
           }
       }
    }
}