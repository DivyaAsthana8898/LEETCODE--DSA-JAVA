class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // frequency
        int n = nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        // frequency
        for(int num:nums){
            if(map.get(num) > 1){
                return true;
            }
        }
        return false;  

    }
}