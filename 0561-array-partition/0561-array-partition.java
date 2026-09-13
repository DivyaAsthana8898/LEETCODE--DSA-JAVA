class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0;i<n;i = i+2){// as the left elem is minimum
            sum = sum + nums[i];
        }
        return sum;
    }
}