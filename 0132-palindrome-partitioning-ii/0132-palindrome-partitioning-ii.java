import java.util.Arrays;

class Solution {
    int dp[] = new int[2001];

    boolean isPalli(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    int solve(String s, int i) {
        if (i >= s.length()) return -1; // Base case, return -1 because we are counting partitions

        if (dp[i] != -1) return dp[i];

        int min = Integer.MAX_VALUE;

        for (int j = i; j < s.length(); j++) {
            if (isPalli(s.substring(i, j + 1))) {
                int cost = 1 + solve(s, j + 1);
                min = Math.min(min, cost);
            }
        }

        return dp[i] = min;
    }

    public int minCut(String s) {
        Arrays.fill(dp, -1);
        return solve(s, 0);
    }
}