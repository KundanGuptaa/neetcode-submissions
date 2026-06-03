class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                if(profit<prices[j]-prices[i]){
                    profit=prices[j]-prices[i];
                }
            }
        }
        return profit;
    }
}
