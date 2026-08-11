class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];// creating new array
        for(int i=0;i<n;i++){// Traversing
          ans[i] = nums[nums[i]];// nums[nums[i]] means first ones index ans will be second ones index and 
          // that index elemnt it will be delivering.

        } 
        return ans;// return that array
          
          
    }
}

// ans = index;
// ans[i] = element at that index;