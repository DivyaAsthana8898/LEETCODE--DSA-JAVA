class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        // frequency + first index + last index
        for (int i = 0; i < nums.length; i++) {

            // frequency
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            // first index — sirf first time
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            // last index — har baar update
            last.put(nums[i], i);
        }

        // degree find karo
        int degree = 0;

        for (int value : freq.values()) {
            degree = Math.max(degree, value);
        }

        // degree wale elements ka shortest subarray
        int ans = nums.length;

        for (int key : freq.keySet()) {

            if (freq.get(key) == degree) {

                int length = last.get(key) - first.get(key) + 1;

                ans = Math.min(ans, length);
            }
        }

        return ans;
    }
}