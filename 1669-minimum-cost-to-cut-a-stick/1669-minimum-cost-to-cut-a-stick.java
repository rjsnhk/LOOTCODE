class Solution {
    int[][] dp;
    int solve(int[] cuts, int i, int j,int start,int end){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
        int cost=solve(cuts,i,k-1,start,cuts[k])+solve(cuts,k+1,j,cuts[k],end)+(end-start);
        min=Math.min(min,cost);
        }
        return dp[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        dp = new int[cuts.length][cuts.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        Arrays.sort(cuts);
        return solve(cuts,0,cuts.length-1,0,n);
    }
}