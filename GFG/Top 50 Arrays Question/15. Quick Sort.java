class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int m = partition(arr,low,high);
            quickSort(arr,low,m-1);
            quickSort(arr,m+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int i = low;
        int pivot = arr[i];
        
        for(int j = low+1; j<=high; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;
        
        return i;
    } 
}
