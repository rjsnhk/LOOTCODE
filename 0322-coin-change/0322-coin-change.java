class Solution {
    public int coinChange(int[] coins, int a) {
        int n = coins.length;
        int dp[][] = new int[n + 1][a + 1];
        
        // Initialize dp array with a large value
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == 0) {
                    dp[i][j] = 0; // 0 coins needed to make amount 0
                } else {
                    dp[i][j] = Integer.MAX_VALUE - 1; // Set default to a large number
                }
            }
        }
        
        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        
        return dp[n][a] == Integer.MAX_VALUE - 1 ? -1 : dp[n][a];
    }
}
