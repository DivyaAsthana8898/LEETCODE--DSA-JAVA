class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        // traversing over array
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }

    } 
}