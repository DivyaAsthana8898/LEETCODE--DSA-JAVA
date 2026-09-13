class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new  HashMap<>();

        for(int i = 0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);// stores the key as well as the frequency;

            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);// stores only the key and its index
                }
                last.put(nums[i],i);// stores only the key and its index
            }
            // now degree
            int degree = 0;
            for(int key : freq.values()){
            degree = Math.max(degree,key);

            }
            // now shortest subarray
            int ans = nums.length;
            for(int key : freq.keySet()){
                if(freq.get(key) == degree){
                    int length = last.get(key) - first.get(key) + 1;
                    ans = Math.min(ans,length);
                }
            }   
        return ans;
    }
}