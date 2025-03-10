class Solution {
    public int solve(String w1,String w2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0) dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=Math.min(1+dp[i-1][j],Math.min(1+dp[i][j-1],1+dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];
        
    }
    public int minDistance(String word1, String word2) {
        return solve(word1,word2,word1.length(),word2.length());
    }
}