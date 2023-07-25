class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n;i++)
            if(arr[i]>=0)
            list.add(arr[i]);
            
            for(int i = 0; i<n;i++)
                if(arr[i]<0)
                list.add(arr[i]);
                
                for(int i = 0; i<n; i++)
                arr[i] = list.get(i);
    }
}