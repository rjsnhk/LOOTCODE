class Solution {
    public int countTarget(int ar[],int t,int n){
        int dp[][]=new int[n+1][t+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<t+1;j++){
                if(ar[i-1]<=j){
                    dp[i][j]=dp[i-1][j-ar[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }

        }
        return dp[n][t];
    }
    public int findTargetSumWays(int[] nums, int target) {
    int sum=0;
    for(int i:nums) sum+=i;
    //target negative bhi ho skta he so usko abs lena he
    if((sum+target)%2!=0 || sum < Math.abs(target)) return 0; 
    int t=(sum+target)/2;
    return countTarget(nums,t,nums.length);
    }
}