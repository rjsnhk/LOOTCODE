class Solution {
    public int countSquares(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
int res=0;
        int dp[][]=new int[m][n];
        
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(i==0||j==0){ //for
            dp[i][j]=mat[i][j]==0?0:1;
        }

        else if(mat[i][j]==1){
            dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
        }
        res+=dp[i][j];
    }
}

return res;
    }
}