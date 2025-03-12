class Solution {
    public int maximumCount(int[] nums) {
        int negC=0;
        int zerC=0;

        if(nums[0]>0) return nums.length;
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0) break;
                else if(nums[i]<0) negC++;
                else zerC++;
            }
            int pos=nums.length-negC-zerC;
            return pos>negC ? pos:negC;
        }
    }
}