class Solution {

    static boolean isValidAnswer(int[] nums, int k, int maxSum) {

        int n = nums.length;
        int subarray = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (sum + nums[i] <= maxSum) {
                sum = sum + nums[i];
            } 
            else {
                subarray++;

                if (subarray > k || nums[i] > maxSum) {
                    return false;
                }

                sum = nums[i];
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        int start = 0;
        int ans = -1;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + nums[i];
        }

        int end = total;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAnswer(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}