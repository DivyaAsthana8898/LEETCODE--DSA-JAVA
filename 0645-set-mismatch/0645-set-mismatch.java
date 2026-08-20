class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int duplicate = -1;

        // Find duplicate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
                break;
            }
        }

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum + duplicate;

        return new int[]{duplicate, missing};
    }
}