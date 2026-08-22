class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;

        for(int posCount = 0; posCount <= n; posCount++) {
            int count = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] >= posCount) {
                    count++;
                }
            }

            if(count == posCount) {
                return posCount;
            }
        }

        return -1;
    }
}