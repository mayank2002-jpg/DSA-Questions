class GfG
{
    int max_sum(int A[], int n)
    {
	    int sum = 0;
	    int res = 0;
	    int currSum = 0;
	    for(int i = 0; i<n; i++){
	        sum += A[i];
	        currSum = currSum+i*A[i];
	    }
	    res = currSum;
	    
	    for(int i = 1; i<n; i++){
	        int nextSum = currSum-(sum-A[i-1])+A[i-1]*(n-1);
	        
	        currSum = nextSum;
	        
	        res = Math.max(nextSum,res);
	    }
	    return res;
    }	
}