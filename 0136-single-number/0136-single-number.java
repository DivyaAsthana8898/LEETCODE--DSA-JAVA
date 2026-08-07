class Solution {
    public int singleNumber(int[] nums) {
        int xorSum = 0;
        for(int n : nums){
            xorSum = xorSum ^ n;

        }
          return xorSum;

    }
    
}