class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        long lsum=0;
        long rsum=0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            lsum=lsum+nums[i];
            rsum=sum-lsum;
            if(lsum>=rsum) ans++;
        }
        return ans;
    }
}