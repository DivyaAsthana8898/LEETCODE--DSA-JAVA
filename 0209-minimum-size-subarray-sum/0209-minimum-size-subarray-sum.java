class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right < n;right++){
            sum = sum + nums[right];
            while(sum >= target){
              min = Math.min(min,right-left+1);// for finding out the min length
              sum = sum - nums[left];
              left++;
            }

             
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}