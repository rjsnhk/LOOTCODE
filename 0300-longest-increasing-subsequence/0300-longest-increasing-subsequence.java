class Solution {
    int lcs (int[] n1,int[] n2){
        int n=n1.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n2.length;j++){
                if(i==0||j==0) dp[i][j]=0;
                else dp[i][j]=-1;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n2.length;j++){
                if(n1[i-1]==n2[j-1]) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n2.length];

    }
    public int lengthOfLIS(int[] n1) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n1.length;i++){
           hs.add(n1[i]);
        }
        int n2[]=new int[hs.size()];
        int i=0;
        for(int n:hs){
            n2[i++]=n;
        }
       Arrays.sort(n2);
        
        return lcs(n1,n2);
    }
}