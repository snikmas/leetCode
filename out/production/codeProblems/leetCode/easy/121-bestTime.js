function maxProfit(prices){
  let currPrice = prices[0];
  let profit = 0;
  for(let i = 1; i < prices.length; i++){
    if(currPrice > prices[i]){
      currPrice = prices[i]
    }
    profit = Math.max(prodit, prices[i] - currPrice)
  }
}