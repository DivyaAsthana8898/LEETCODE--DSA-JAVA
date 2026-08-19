class Solution {
    public int maximumWealth(int[][] accounts) {
    
        int maxWealth = 0;
       // int  maxi = Integer.MAX_VALUE;
        for(int i =0;i<accounts.length;i++ ){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
                maxWealth = Math.max(sum,maxWealth);
                  


            }
        
        return maxWealth;
    }
}