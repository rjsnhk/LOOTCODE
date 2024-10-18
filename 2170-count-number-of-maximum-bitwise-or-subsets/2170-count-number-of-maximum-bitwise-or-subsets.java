class Solution {
    public int countSubset(int idx,int curor,int nums[],int maxor){
        if(idx==nums.length){
            if(curor==maxor) return 1;
            return 0;
        }

        int takeCount=countSubset(idx+1,curor|nums[idx],nums,maxor);
        int notTakeCount=countSubset(idx+1,curor,nums,maxor);

        return notTakeCount+ takeCount;
    }

    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for(int i:nums){
            maxOr|=i;
        }
        int curor=0;
        return countSubset(0,curor,nums,maxOr);
    }
}