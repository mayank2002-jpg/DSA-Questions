class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i]==0)
            arr[i] = -1;
            
            sum += arr[i];
            
            if(sum == 0)
            count++;
            
            if(map.containsKey(sum))
            count+=map.get(sum);
            
            if(!map.containsKey(sum))
            map.put(sum,1);
            
             else
                map.put(sum, map.get(sum) + 1);
        }
        return count;
    }
}
