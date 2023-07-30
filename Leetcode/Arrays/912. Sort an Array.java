class Solution {

public void mergeProcedure(int[] num, int low, int mid, int high){
int n1 = mid-low+1;
int n2 = high-mid;

int leftSubarray[] = new int[n1];
int rightSubarray[] = new int[n2];

for(int i = 0; i<n1; i++){
    leftSubarray[i] = num[low+i];
}

for(int j = 0; j<n2; j++){
    rightSubarray[j] = num[mid+1+j];
}

int i = 0, j = 0, k = low;

while(i<n1 && j<n2){
    if(leftSubarray[i]<=rightSubarray[j]){
        num[k] = leftSubarray[i];
        i++;
    }
    else{
        num[k] = rightSubarray[j];
        j++;
    }
    k++;
}

while(i<n1){
    num[k] = leftSubarray[i];
    i++;
    k++;
}

while(j<n2){
    num[k] = rightSubarray[j];
    j++;
    k++;
}
}

public void mergeSort(int[] num, int low, int high){
    if(low<high){
        int mid = low+(high-low)/2;

        mergeSort(num,low,mid);
        mergeSort(num,mid+1,high);

        mergeProcedure(num, low, mid, high);
    }
}


public int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length-1);
    return nums;
}
}