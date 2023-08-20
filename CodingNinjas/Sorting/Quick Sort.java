public class Solution {
	public static int partition(int[] arr, int l, int h){
		int i = l;
		int pivot = arr[i];
		for(int j = l+1; j<=h; j++){
			if(arr[j]<=pivot){
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
	}
	public static void quickSort(int[] arr,int l, int h) {
		if(l<h){
			int m = partition(arr,l,h);
			quickSort(arr, l, m-1);
			quickSort(arr, m+1, h);
		}
		
	}
	
}