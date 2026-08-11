class Solution {
    public int removeElement(int[] nums, int val) {
        int slow =0;
        int n = nums.length;
        for(int fast=0;fast<n;fast++){ // fast = 0 Because the first element might be the value we're supposed to remove!
            if(nums[fast]!= val){
                nums[slow] = nums[fast];
                slow++;

            }
           
        }
          return slow;// return NUMBER OF VALID ELEMENTS
    }
}