
     class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // 1. Create a dynamic roster that allows mid-line insertions
        List<Integer> targetList = new ArrayList<>();
        
        // 2. Run the play-by-play drill
        for (int i = 0; i < nums.length; i++) {
            // ArrayList.add(index, element) automatically shifts 
            // downstream elements to the right!
            targetList.add(index[i], nums[i]);
        }
        
        // 3. Lock in the final lineup back into a primitive array
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }
        
        return target;
    }
}
  