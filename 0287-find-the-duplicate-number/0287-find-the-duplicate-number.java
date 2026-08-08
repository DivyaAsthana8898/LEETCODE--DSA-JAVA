class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int arr: nums){
            freq.put(arr,freq.getOrDefault(arr,0) +1);
        }
        for(int i:nums){
            if(freq.get(i) > 1){// if the occurence is greater then 1 then return that value
                return i;
            }
        }
        return -1;
    }
}