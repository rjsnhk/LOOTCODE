class Solution {
    int dp[];
    int solve(int n){
        if(dp[n]!=-1) return dp[n];
        if(n<=1) return 1;
       int l=solve(n-1);
       int r=solve(n-2);
       return dp[n]=l+r;
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}