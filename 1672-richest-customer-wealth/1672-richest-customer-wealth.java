class Solution {
    public int maximumWealth(int[][] accounts) {
         int maxWealth = 0; 
         for(int i = 0;i<accounts.length;i++){//for row which customer to add first ;
         int sum = 0;
           for(int j = 0; j < accounts[i].length;j++){//  which column bank needs to be process first;
            sum = sum + accounts[i][j];
           }
           maxWealth = Math.max(maxWealth,sum);

            
         }
         return maxWealth;
        
        
    }
}//i = customer
// j = us customer ka bank
// sum = current customer ki total money
// maxWealth = sab custome