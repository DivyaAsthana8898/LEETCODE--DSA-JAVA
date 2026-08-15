
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;// setting the maxprofit to zero ;
        int Costprice = Integer.MAX_VALUE; // setting the Cost price to INTEGER.MAX Value so that first compareing with the biggest
        if(prices == null || prices.length<2){// prices  if null or less than 2 day then buy sell can form;
            return 0;
        }
        for(int SellingPrice : prices ){
          if (SellingPrice < Costprice){//7<12123212
                Costprice = SellingPrice; // now assingning 7 to cp
            
            }else{
                int profit  = SellingPrice - Costprice;// 5-1=4 profit 
                if(profit>maxprofit){//4>0 
                   maxprofit = profit;        
                    
                }
            }
        }
             return maxprofit;// return max profit
        }
    }
