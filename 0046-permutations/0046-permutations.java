class Solution {
    static void solve(int []nums,List<Integer> output  ,List<List<Integer>> ans){
         
          if( nums.length == 0){// base condition
            ans.add(new ArrayList<>(output));// list ko  bdi list k andar 
            return;
          }
          for( int i = 0;i < nums.length;i++){
            int ch = nums[i];
             int []rem = new int [nums.length-1];//ek naya integer array banao jiska size original array se 1 kam ho.
             int index = 0;
             // creating array for remaning elemnts;
             for(int j = 0;j< nums.length ; j++){
                if(j != i){
                    rem[index] = nums[j];
                    index++;
                }
             }
               // add
               output.add(ch);
               // performing recursion
            solve(rem,output,ans);

             // backtracking
            output.remove(output.size()-1);
          }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums,output ,ans);
        return ans;
    }
}