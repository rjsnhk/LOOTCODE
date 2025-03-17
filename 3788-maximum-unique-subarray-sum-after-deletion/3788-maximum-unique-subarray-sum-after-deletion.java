class Solution {
    public int maxSum(int[] nums) {
    HashSet<Integer> hs=new HashSet<>();

        int ans=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) hs.add(nums[i]);
            max=Math.max(nums[i],max);
        }
        if(hs.isEmpty()) return max;
        for(int i:hs){
            ans+=i;
        }
        return ans;
    }
}