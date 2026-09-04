class Solution {
     static void  solve(int []candidates,int count ,int target,int index,  List<List<Integer>> ans, List<Integer> output,int k){
        if(count == k && target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        output.add(candidates[index]);
        // include 
        solve(candidates,count+1,target-candidates[index],index+1,ans,output,k);
        // backtracking;
        output.remove(output.size()-1);
        // exclude;
        while(index+1 <  candidates.length  && candidates[index] == candidates[index+1]){
            index++;
        }
        solve(candidates,count,target,index+1,ans,output,k);

     }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int count = 0 ;
        int target = n;
        int [] candidates = {1,2,3,4,5,6,7,8,9};
        solve(candidates,count,target,index,ans,output,k);
        return ans;

    }
}