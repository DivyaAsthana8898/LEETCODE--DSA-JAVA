class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int result = nums[0] * nums[1];
        int result2 = nums[n-1] * nums[n-2];
        
        int maxi = result2 - result;


                return maxi;
         }

     }

// class Solution {
//     public int maxProductDifference(int[] nums) {
    
//         Arrays.sort(nums);
//         int n = nums.length;
//         int ans = 0;
        
//         for(int i = 0;i<n-1;i++){
//                 int result1 = nums[i] * nums[i+1];

//                 int result2 = nums[n-1] * nums[n-2];

//                  int   maxi =  result2 - result1 ;
//                   ans = Math.max(ans,maxi);

            
//         }
//         return ans;
//     }
// }