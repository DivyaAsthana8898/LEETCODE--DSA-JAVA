class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;// maxi set to -infinite
        

        for(int i = 0;i<n ;i++){ // traveersing
            sum= sum + nums[i];// 0 + current value of array
             maxi = Math.max(maxi,sum);// returning maximum value from  among the two
            if(sum < 0){// in case if neg sum just return the zero
                sum = 0;

            }
       
        }// return max value
          return maxi;
    }
}