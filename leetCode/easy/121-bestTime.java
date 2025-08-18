lass Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 1){
            return profit;
        }
        int buyPrice = prices[0];
        int sellPrice;
        // 4 5 1 8
        for (int i = 1; i < prices.length; i ++){
            int tempProfit = prices[i] - buyPrice;
            if (prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            if (tempProfit > profit){
                profit = tempProfit;
            }

        }
                System.gc();

        return profit;
    }
}