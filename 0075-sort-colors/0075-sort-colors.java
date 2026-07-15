class Solution {
    public void sortColors(int[] nums) {
        int left = 0,mid=0,right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 0){
            swap(left,mid,nums);
            left++;
            mid++;

        } else if(nums[mid] == 1){
            mid++;
        }else{
            swap(right,mid,nums);
            right--;
        }
        }
    }
     public void swap (int i,int j, int[]nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }
}