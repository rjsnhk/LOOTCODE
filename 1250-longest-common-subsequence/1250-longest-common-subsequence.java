class Solution {
    int lcs(String t1, String t2,int n,int m){
        int dp[][]=new int[n+1][m+1];
        // if(n==0||m==0) return 0;
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0) dp[i][j]=0;
                else dp[i][j]=-1;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
            dp[i][j]=1+dp[i-1][j-1];
        }else{
            dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
            }
        }
        return dp[n][m];




        
           }
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1,text2,text1.length(),text2.length());
    }
}