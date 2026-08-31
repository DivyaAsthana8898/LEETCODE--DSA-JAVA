
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // k largest elements
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums.length - k; i < nums.length; i++) {
            map.put(sorted[i], map.getOrDefault(sorted[i], 0) + 1);
        }

        // original order maintain
        int[] ans = new int[k];
        int j = 0;

        for (int num : nums) {
            if (map.getOrDefault(num, 0) > 0) {
                ans[j++] = num;
                map.put(num, map.get(num) - 1);
            }

            if (j == k) {
                break;
            }
        }

        return ans;
    }
}