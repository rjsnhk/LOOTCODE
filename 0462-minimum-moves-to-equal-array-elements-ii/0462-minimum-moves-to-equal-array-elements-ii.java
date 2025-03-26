class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int ele=nums[mid];
        int ans=0;
        for(int i:nums){
            ans+=Math.abs(ele-i);
        }
        return ans;
    }
}