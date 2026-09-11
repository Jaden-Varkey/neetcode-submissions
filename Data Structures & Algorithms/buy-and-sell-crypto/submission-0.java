class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0, j = 1; j < prices.length; j++) {
            if (prices[i] >= prices[j]) {
                i = j;
                continue;
            }
            int profit = prices[j] - prices[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
