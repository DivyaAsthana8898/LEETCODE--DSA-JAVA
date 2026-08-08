class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        
        for(int nums : arr){
        freq.put(nums,freq.getOrDefault(nums,0)+1); 
        }
        for(int i:arr){
        if(freq.get(i) > 1){
            return i;
        }

        }
        return -1;
    }
}