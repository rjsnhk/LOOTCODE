

class Solution {
    int solve(int k, int n, int[][] dp) {
        if (k == 1) return n; // If only 1 egg is left, check all floors
        if (n == 0 || n == 1) return n; // 0 or 1 floor cases
        if (dp[k][n] != -1) return dp[k][n]; // Memoization check

        int min = Integer.MAX_VALUE;
        int low = 1, high = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            int left = (dp[k - 1][mid - 1] != -1) ? dp[k - 1][mid - 1] : solve(k - 1, mid - 1, dp);
            int right = (dp[k][n - mid] != -1) ? dp[k][n - mid] : solve(k, n - mid, dp);

            int worst = 1 + Math.max(left, right); // Worst case scenario
            min = Math.min(min, worst);

            if (left < right) {
                low = mid + 1; // Move up since more drops are needed above
            } else {
                high = mid - 1; // Move down
            }
        }

        return dp[k][n] = min;
    }

    public int twoEggDrop(int n) {
        int[][] dp = new int[3][n + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(2, n, dp);
    }
}