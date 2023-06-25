class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);

        for(int i = 0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                int currentSum = nums[i]+nums[start]+nums[end];
                if(currentSum>target){
                    end--;
                }
                else{
                    start++;
                }
                if(Math.abs(currentSum-target)<Math.abs(result-target)){
                    result = currentSum;
                }
            }
        }
        return result;
    }
}