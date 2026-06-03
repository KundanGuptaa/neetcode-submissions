class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int profit = 0;
        int[] minArr = new int[l];
        int[] maxArr = new int[l];
        minArr[0] = prices[0];
        maxArr[l - 1] = prices[l - 1];

        for (int i = 1; i < l; i++) {
            minArr[i] = Math.min(minArr[i - 1], prices[i]);
            maxArr[l - i - 1] = Math.max(maxArr[l - i], prices[l - i - 1]);
        }

        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, maxArr[i] - minArr[i]);
        }

        return profit;
    }
}
