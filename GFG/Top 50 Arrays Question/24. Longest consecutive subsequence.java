class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   HashSet<Integer> S = new HashSet<>();
	   int ans = 0;
	   for(int i = 0; i<N; i++)
	       S.add(arr[i]);
	   
	   for(int i = 0; i<N; i++){
	       if(!S.contains(arr[i]-1)){
	           int j = arr[i];
	           while(S.contains(j)){
	               S.remove(Integer.valueOf(j));
	               j++;
	           }
	           if(ans<j-arr[i])
	               ans = j-arr[i];
	       }
	   }
	    return ans;
	}
}