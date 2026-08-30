class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
               int n = nums.length;
        for(int i = 0;i<n;i++){

            int needed = target - nums[i];
            while(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i] , i);

        }
        return new int[]{};
    }
}
//brute force 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i =0;i< nums.length;i++){
//             for(int j= i+1 ; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     int [] ans = {i,j};
//                     return ans;
//                 }

//             }
//         }
//          int ans[] = {};
//          return ans;
//     }
// }
