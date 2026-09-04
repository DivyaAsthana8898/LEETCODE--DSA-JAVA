class Solution {
    static void solve(int []candidates,int target,int index, List<List<Integer>> ans ,  List<Integer> output){
        //base case 
        if(target == 0){
            // base case hit hogya 
            ans.add(new ArrayList<>(output));
            return;
        }
       // check marks ;
        if(index >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        output.add(candidates[index]);
        // include
        solve(candidates,target-candidates[index],index,ans,output);// no index + 1 as The same number may be chosen from candidates an unlimited number of times;
        // backtracking process
        output.remove(output.size()-1);
        // Exclude case
        solve(candidates,target,index+1,ans,output);     
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(candidates,target,index,ans,output);
        return ans;
    }
}