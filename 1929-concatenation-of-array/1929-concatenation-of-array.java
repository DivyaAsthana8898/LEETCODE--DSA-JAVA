class Solution {
    public int[] getConcatenation(int[] nums) {
         int n = nums.length;
         int []ans = new int [2*n];
         for(int i=0;i<n;i++){
           ans[i] = nums[i];// copy the first half;
           ans[i + n] = nums[i]; // nums[i] = 0;   ans[i] = 0 as will start from 0 + n where  n is the length of prev array suppose 3; 0 + 3= 3 ans[3] = nums[0] put nums[0] index value at ans 3rd index. it is saying. 

         }
          return ans;

    }
}
//i+n means 0+3 = 3 starts from 3rd index