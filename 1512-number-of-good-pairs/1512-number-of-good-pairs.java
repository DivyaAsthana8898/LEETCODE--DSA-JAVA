class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int []freq = new int[101];

        for(int num : nums){
            count  = count + freq[num];
            freq[num] = freq[num] + 1;

        }
        return count;

    }
}