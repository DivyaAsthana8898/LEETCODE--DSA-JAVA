class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        
        for(int i = 0;i<n;i++){
            int newReach ;
        
            newReach = i + nums[i];// i us index ki value // nums[i] is index pr ki element
            if(i>maxReach){
                return false;
            }
             maxReach = Math.max(maxReach,newReach);

    
        }
        return true;
        
    }
}