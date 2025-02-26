class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int currProfit=0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            currProfit=prices[i]-mini;
            maxProfit=Math.max(maxProfit,currProfit);
            mini=Math.min(mini,prices[i]);
        }
        return maxProfit;
    }
}