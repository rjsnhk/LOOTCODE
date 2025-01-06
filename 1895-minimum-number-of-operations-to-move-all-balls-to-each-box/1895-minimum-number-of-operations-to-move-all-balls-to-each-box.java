class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] prefixSum = new int[n];

        int sum = 0, count = 0;
        for (int j = 0; j < n; j++) {
            if (boxes.charAt(j) == '1') {
                count++;
                sum += j; 
            }
        }
        prefixSum[0] = sum;
        int onesEncountered = 0;
        if (boxes.charAt(0) == '1') onesEncountered++;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] - (count - onesEncountered) + onesEncountered;
            if (boxes.charAt(i) == '1') onesEncountered++;
        }
        return prefixSum;
    }
}