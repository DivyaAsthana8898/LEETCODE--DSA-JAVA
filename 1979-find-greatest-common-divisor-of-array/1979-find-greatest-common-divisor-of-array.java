class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while(max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return min;
    }
}