class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end - start )/2;
            long coins = mid * (mid+1)/2;
            // check if coins are 6 == 6
            if(coins == n){
                return (int) mid;
            }
            if(coins <= n){
                start = mid+1;
                }else{
                    end = mid -1;

                }
            }
                 
                return (int)end;
            } 
        }
   
    
