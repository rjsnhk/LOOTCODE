class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int maxV=nums[0];
        for(int j:nums){
            maxV=Math.max(j,maxV);
        }
        int eA[]=new int[maxV+1];
        for(int i:nums){
            eA[i]=eA[i]+i;
        }
        int dp[]=new int[maxV+1];
        dp[1]=eA[1];
        for(int i=2;i<=maxV;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+eA[i]);
        }
        return dp[maxV];
    }
}