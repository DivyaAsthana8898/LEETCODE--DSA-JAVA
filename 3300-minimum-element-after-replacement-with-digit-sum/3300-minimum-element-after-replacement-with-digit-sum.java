class Solution {
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}