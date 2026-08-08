class Solution {
    public int pivotIndex(int[] nums) {
        // creation of array
        int n = nums.length;
        int[] leftSum = new int [n];
        int [] rightSum = new int [n];
        // filling the leftSum;
           // note left will proceed toward the right 
        leftSum[0] = nums[0];
        for(int i =1;i<n ;i++){
            leftSum[i] = leftSum[i-1] + nums[i];

        }
                            // note right will proceed toward the left
        // filling the rightSum
        rightSum[n-1] = nums[n-1];
        for(int i = n-2;i>=0 ;i--){
            rightSum[i] = rightSum[i+1] + nums[i];



        }
         // equality check
        for(int i = 0;i<n;i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
            return -1;

          
    }

}