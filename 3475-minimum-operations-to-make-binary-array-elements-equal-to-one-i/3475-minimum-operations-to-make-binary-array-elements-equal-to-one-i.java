class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==0){
                c++;
                for(int j=i;j<i+3;j++){
                    nums[j]= nums[j]==1 ?0 :1;
                }
            }
        }
        if(nums[nums.length-1]!=1 || nums[nums.length-2]!=1) return -1;
        return c;

    }
}