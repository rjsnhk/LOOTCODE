class Solution {
    public int longestNiceSubarray(int[] nums) {
        int s=0;
        int max=0;
        int bitMask=0;
        int n=nums.length;
        for(int e=0;e<n;e++){
            while((bitMask&nums[e])!=0){
                bitMask=bitMask^nums[s];
                s++;
            }
            bitMask=bitMask | nums[e];
            max=Math.max(max,e-s+1);
        }
        return max;
    }
}