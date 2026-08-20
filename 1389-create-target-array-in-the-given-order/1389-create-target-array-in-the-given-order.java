class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            targetList.add(index[i],nums[i]);// Actual logic postion , value
        }// converting arraylist to array
        int []target = new int [nums.length];
        for(int i =0;i<nums.length;i++){
            target[i] = targetList.get(i);
        }
        return target;
    }
}