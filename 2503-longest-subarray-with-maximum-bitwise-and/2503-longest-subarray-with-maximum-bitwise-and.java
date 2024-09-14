class Solution {
    public int longestSubarray(int[] nums) {
        int ar=nums.length;
        int ans=0;
        int l=0;
        int max=-1;
        for(int i:nums){
            max=Math.max(i,max);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max) {l++;
            
            ans=Math.max(ans,l);
            }
            else l=0;
        }
        return ans;
    }
}