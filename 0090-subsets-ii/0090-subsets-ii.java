class Solution {
    static void solve(int[]nums,int index,List<Integer> output,List<List<Integer>> ans){
        if(index >= nums.length ){
            // base case hit 
            ans.add(new ArrayList<>(output));
            return;
        }
        int CurrValue = nums[index];
        output.add(CurrValue);
        // include case
        solve(nums,index+1,output,ans);
        // remove case BACKTRACKING
        output.remove(output.size()-1);// removing the last element to reach previous state
        // exclude
        
         while(index + 1 < nums.length && nums[index] == nums[index+1]){
            index++;
         }
         solve(nums,index+1,output,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;

    }

}