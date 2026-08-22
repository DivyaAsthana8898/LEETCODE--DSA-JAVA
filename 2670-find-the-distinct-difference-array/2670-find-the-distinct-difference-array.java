class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            HashSet<Integer> left = new HashSet<>();
            HashSet<Integer> right = new HashSet<>();

            // Left side: 0 to i
            for (int j = 0; j <= i; j++) {
                left.add(nums[j]);
            }

            // Right side: i+1 to n-1
            for (int j = i + 1; j < n; j++) {
                right.add(nums[j]);
            }

            ans[i] = left.size() - right.size();
        }

        return ans;
    }
}

 // .add 
 // .size // HashSet been used to avoid duplicacy 