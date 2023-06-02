import java.util.* ;
import java.io.*; 
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {

            arr[i] = sc.nextInt();

        }

        int K = sc.nextInt();

        for(int j=0; j<K; j++) {

            for(int k=n-1; k>=0; k--){
                int temp = arr[0];
                arr[0] = arr[k];
                arr[k] = temp;

            }

        }

        for(int i=0; i<n; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}