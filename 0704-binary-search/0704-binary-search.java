class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

      int   mid = start + (end - start)/2;

      // now setting up the conditions;
      while(start <= end){
        if(nums[mid] == target){
            return mid;
        }
// if the target is greater then mid right traversal
        else if(target > nums[mid]){
            start = mid +1;
// if the target is less then mid left traversal
        }else{
            end = mid -1;

        }
        // update mid
        mid = start + (end - start)/2;

      }

// if no target found ;
        return -1;
    }
}