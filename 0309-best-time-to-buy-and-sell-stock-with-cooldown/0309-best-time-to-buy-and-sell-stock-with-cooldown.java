class Solution {
    public int maxProfit(int[] prices) {

        int hold = -prices[0];// current possibilite1
        int sold = 0;//// current possibilite2
        int rest = 0;// current possibilite3

        for (int i = 1; i < prices.length; i++) {

            int prevHold = hold; // states1
            int prevSold = sold;// states2
            int prevRest = rest;// prev states3

            hold = Math.max(prevHold, prevRest - prices[i]);

            sold = prevHold + prices[i];

            rest = Math.max(prevRest, prevSold);
        }

        return Math.max(sold, rest);
    }
}