class Solution {
     static void solve(int []candidates,int target,int index,List<List<Integer>> ans,List<Integer> output){
        if(target == 0){
            // base case hit;
            ans.add(new ArrayList<>(output));
            return;
        }// checks 
         if(index >= candidates.length){
            return;
         }
         if(target < 0){
            return ;
         }
         output.add(candidates[index]);
         // include 
         solve(candidates,target-candidates[index],index+1,ans,output);
         // backtracking
         output.remove(output.size()-1);
         // exclude case;
         while(index+1 < candidates.length && candidates[index] == candidates[index+1]){
            index++;
         }
          // exclude 
         solve(candidates,target,index+1,ans,output);

     }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(candidates,target,index,ans,output);
        return ans;
    }
}