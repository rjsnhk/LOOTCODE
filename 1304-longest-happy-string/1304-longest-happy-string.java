class Solution {

    public char max(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        if (max == a) {
            return 'a';
        } else if (max == b) {
            return 'b';
        } else {
            return 'c';
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        int countA = 0, countB = 0, countC = 0;

        while (a > 0 || b > 0 || c > 0) {
            char nextChar = max(a, b, c);

            if ((nextChar == 'a' && countA == 2) || (nextChar == 'b' && countB == 2) || (nextChar == 'c' && countC == 2)) {
                // If adding the max character results in three consecutive characters, choose another character
                if (nextChar == 'a' && b > 0) {
                    nextChar = 'b';
                } else if (nextChar == 'a' && c > 0) {
                    nextChar = 'c';
                } else if (nextChar == 'b' && a > 0) {
                    nextChar = 'a';
                } else if (nextChar == 'b' && c > 0) {
                    nextChar = 'c';
                } else if (nextChar == 'c' && a > 0) {
                    nextChar = 'a';
                } else if (nextChar == 'c' && b > 0) {
                    nextChar = 'b';
                } else {
                    // No valid character to choose from
                    break;
                }
            }

            // Add the chosen character to the answer and update counts
            ans.append(nextChar);
            if (nextChar == 'a') {
                a--;
                countA++;
                countB = 0;
                countC = 0;
            } else if (nextChar == 'b') {
                b--;
                countB++;
                countA = 0;
                countC = 0;
            } else {
                c--;
                countC++;
                countA = 0;
                countB = 0;
            }
        }

        return ans.toString();
    }
}
