class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {//kya next number current number se exactly 1 bada hai
                i++;
            }

            if (start == nums[i]) {
                ans.add(String.valueOf(start));// only one no  no range  
            } else {
                ans.add(start + "->" + nums[i]);// range khatam
            }

            i++;
        }

        return ans;
    }
}