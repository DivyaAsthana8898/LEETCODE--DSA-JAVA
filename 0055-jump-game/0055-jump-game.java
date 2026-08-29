class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        

        for(int i = 0;i<nums.length;i++){
            int newReach = 0;
            newReach = i + nums[i];

            if(i>maxReach){
                return false;
            }
                maxReach = Math.max(maxReach,newReach);

        }
    
       return true; 
    }
}