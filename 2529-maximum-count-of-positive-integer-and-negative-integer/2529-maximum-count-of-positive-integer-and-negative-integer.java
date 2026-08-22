class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
          int count =0;
          int posCount = 0;
          int negCount = 0;
           
            for(int i = 0;i<n;i++){
                if(nums[i] == 0){
                    count = count + 0;
                }
                 else if(nums[i] < 0 ){
                    negCount++;

                 }else{
                    posCount++;
                 }
            
        }
           int result = Math.max(posCount,negCount);
        return result;
    }
}