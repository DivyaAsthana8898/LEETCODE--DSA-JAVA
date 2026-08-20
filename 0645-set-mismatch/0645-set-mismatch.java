class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // duplicate
        int duplicate = -1;
        for(int i = 1;i<n;i++){
            if(nums[i] == nums[i-1]){
                duplicate = nums[i];
                break;
            }
        }
        // missing
  
        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for(int num : nums){
         actualSum += num;
    }
      int missing = expectedSum - actualSum + duplicate;
      return new int[]{duplicate , missing};

    }
}