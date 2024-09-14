class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int ans=0;
        int l=0;
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(max<nums[i]) max=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==max) {l
            ++;
            
            ans=Math.max(ans,l);
            }
            else l=0;
        }
        return ans;
    }
}