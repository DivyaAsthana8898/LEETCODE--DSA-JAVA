class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
     
        // first window
            for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
           int max = sum;
          for(int right = k; right<n; right++){
         
             
                 sum = sum - nums[left] + nums[right];// fixed sliding window formula
                 left++;
                if(sum > max){
                    max = sum;
                }
             }
        
        return (double) max / k;
    }
}