class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        // nums1 ke elements check karo
        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !list1.contains(nums1[i])) {
                list1.add(nums1[i]);
            }
        }

        // nums2 ke elements check karo
        for (int i = 0; i < nums2.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {

                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !list2.contains(nums2[i])) {
                list2.add(nums2[i]);
            }
        }

        // Dono lists ko answer mein add karo
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}