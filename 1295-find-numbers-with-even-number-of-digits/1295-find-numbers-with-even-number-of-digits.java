class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            int count = 0;
            while(nums[i] != 0){
           
             nums[i] = nums[i] / 10;// counting the digits
              count ++;
            }
                if(count % 2 == 0){
                    ans++;
                 
                    

                }
            }
               return ans;
        }
     
    }

// count → current number ki digits

// ans → poore array mein kitne valid numbers