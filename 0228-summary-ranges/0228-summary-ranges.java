class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;// if current k age wala is bigger then current
            }

            if (start == nums[i]) {
                ans.add(String.valueOf(start));// same range me rkho 
            } else {
                ans.add(start + "->" + nums[i]);// range khatam
            }

            i++;
        }

        return ans;
    }
}