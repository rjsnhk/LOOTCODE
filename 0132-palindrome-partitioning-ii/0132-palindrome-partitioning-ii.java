import java.util.Arrays;

class Solution {
    int dp[][] = new int[2001][2001];

    boolean isPalli(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    int solve(String s, int i, int j) {
        if (i >= j) return 0; // If there's one or no character, no cuts needed

        if (isPalli(s, i, j)) return dp[i][j] = 0; // No partition needed if already palindrome

        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            if (isPalli(s, i, k)) { // Only make a cut if `s[i..k]` is a palindrome
                int temp = 1 + solve(s, k + 1, j);
                min = Math.min(min, temp);
            }
        }

        return dp[i][j] = min;
    }

    public int minCut(String s) {
        for (int i = 0; i < 2001; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(s, 0, s.length() - 1);
    }
}