class Solution {
    public int maxProfit(int[] prices) {
        int profit= 0;
        int prevProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                prevProfit = prices[i] - prices[i-1];
                profit = profit + prevProfit;
            }
        } 
         return profit;

      }
  }
 