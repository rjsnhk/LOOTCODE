//kadans algo

class Solution {
    int kadanMax(int[] nums){
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            max=Math.max(max,curr);
        }
        return max;
    }
    int kadanMin(int[] nums){
        int curr=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.min(nums[i],nums[i]+curr);
            min=Math.min(min,curr);
        }
        return min;
    }
    public int maxAbsoluteSum(int[] nums) {
        int min=kadanMin(nums);
        int max=kadanMax(nums);
        return Math.max(Math.abs(max),Math.abs(min));
    }
}