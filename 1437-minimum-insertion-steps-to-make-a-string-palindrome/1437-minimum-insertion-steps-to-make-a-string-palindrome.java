class Solution {
    public int minInsertions(String s1) {
        int n=s1.length();
        String s2="";
        for(int i=n-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0) dp[i][j]=0;
                else dp[i][j]=-1;
            }
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        return n-dp[n][n];

    }
}