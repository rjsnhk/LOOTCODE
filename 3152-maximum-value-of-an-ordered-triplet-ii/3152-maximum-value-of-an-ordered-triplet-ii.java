class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        int n=nums.length;
       var pref_max=new int[n];
       var suff_max=new int[n];
pref_max[0]=nums[0];
suff_max[n-1]=nums[n-1];
       for(int i=1;i<n;i++){
            pref_max[i]=pref_max[i-1]>nums[i] ?pref_max[i-1]:nums[i];
       }
       for(int i=n-2;i>=0;i--){
            suff_max[i]=suff_max[i+1]>nums[i] ?suff_max[i+1]:nums[i];
       }

       for(int j=1;j<nums.length-1;j++){
            ans=Math.max(ans,(long)((long)(pref_max[j-1]-nums[j])*suff_max[j+1]));
       }
       return ans;
    }
}