class Solution {
    public int removeElement(int[] nums, int val) {
        int slow =0;
        int n = nums.length;
        for(int fast=0;fast<n;fast++){
            if(nums[fast]!= val){
                nums[slow] = nums[fast];
                slow++;

            }
           
        }
          return slow;
    }
}