class Solution {
    
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=nums[0];
        int max=nums[0];
        int min=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            currMin=Math.min(nums[i],currMin+nums[i]);
            max=Math.max(currMax,max);
            min=Math.min(min,currMin);
            totalSum+=nums[i];
        }
        int circSum=totalSum-min;
        if(max>0) return Math.max(max,circSum);
        return max;
    }
}