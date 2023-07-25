class Solution
{
    public static void sort012(int a[], int n)
    {
        int low = 0, mid = 0, high = n-1;
        
        while(mid<=high){
            if(a[mid]==0){
                // Swap low and mid
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                // Swap mid and high
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}