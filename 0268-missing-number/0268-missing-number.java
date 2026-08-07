class Solution {
    public int missingNumber(int[] nums) {
      /// here applying xor for all arrayelements
        int xorSum = 0;
        for(int n : nums){
            xorSum = xorSum ^ n;
        }

        /// here applying xor for the elements in range
        int n = nums.length;
         for(int i = 0;i<=n;i++){
            xorSum = xorSum ^ i;
         }
    
     return xorSum;
    }
}