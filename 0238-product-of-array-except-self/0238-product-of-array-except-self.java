class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int [n];// creating new array
         ans[0] = 1;//0 index set by 1
         for(int i = 1;i<n;i++){
            ans[i] = ans[i -1] * nums[i-1]; //2*3 for 3 in array = 6

         }
         int suffix = 1;
         for(int i = n-1;i>=0;i--){// // suffixes rhs product [24,24,12,4]

         ans[i] = ans[i] * suffix;//// ans[i] = is the lhs arrays product and the suffix is the total sum of right product  6 * 1
         suffix = suffix * nums[i]; // ye new suffix bnane k liye rhs product  ex right prod->1*4->el

         }
         return ans;
         }
         
    }// 2361 14
