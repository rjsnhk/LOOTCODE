class Solution {
    long dp[];
    long solve(int[][] q,int i){
        
        if(i>=q.length) return 0;
        if(dp[i]!=-1) return dp[i];
        long liya=q[i][0]+solve(q,(i+q[i][1]+1));
        long nhi=solve(q,i+1);
        return dp[i]=Math.max(liya,nhi);
    }
    public long mostPoints(int[][] questions) {
        dp=new long[questions.length+1];
        Arrays.fill(dp,-1);
          return solve(questions,0);

    }
}