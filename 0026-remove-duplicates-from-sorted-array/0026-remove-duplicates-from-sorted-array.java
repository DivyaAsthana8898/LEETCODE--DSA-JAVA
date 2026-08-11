class Solution {
    public int removeDuplicates(int[] nums) {
        int slow =0;
        int n = nums.length;
        for(int fast = 1;  fast < n;fast++){ 
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
           
        }
         return slow + 1;// If slow represents the index of the last unique element, the number of unique elements = slow + 1
    }
}