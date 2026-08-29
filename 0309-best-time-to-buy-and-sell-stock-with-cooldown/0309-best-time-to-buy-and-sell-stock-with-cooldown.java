class Solution {
    public int maxProfit(int[] prices) {

        int hold = -prices[0];// current possibilite1
        int sold = 0;//// current possibilite2
        int rest = 0;// current possibilite3

        for (int i = 1; i < prices.length; i++) {

            int prevHold = hold; // states1
            int prevSold = sold;// states2
            int prevRest = rest;// prev states3

            hold = Math.max(prevHold, prevRest - prices[i]); //stock abhi paas hai final answer nahi

            sold = prevHold + prices[i];//stock sell ho chuka  valid final profit

            rest = Math.max(prevRest, prevSold);// stock nahi hai  valid final profit
            // => cooldown state;  
        }

        return Math.max(sold, rest);
    }
}
// hold → Stock mere paas hai; ya to pehle se hold kiya hai ya aaj buy kiya hai.
// sold → Stock aaj sell kiya hai, aur selling ke baad profit calculate hua hai.
// rest → Aaj na buy kiya na sell; ya to normal rest hai ya previous day ke sell ke baad cooldown hai.