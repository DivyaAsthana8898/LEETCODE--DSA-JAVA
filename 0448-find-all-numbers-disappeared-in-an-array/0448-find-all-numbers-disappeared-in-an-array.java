class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}

// BRUTE FORCE 

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         int n = nums.length;
      
//         //     // 1 se n tak har number check karo
//         for(int i=1;i<=n;i++){
//                     Boolean found = false;
//               // check karo i array mein hai ya nahi
//             for(int j =0;j<n;j++){
//                 if(nums[j] == i){
//                     found = true;
//                     break;

//                 }
//             }
//         //  // agar poore array mein i nahi mila
//          if(found == false){
//             ans.add(i);
//          }
//         }
//          return ans;
//     }

// }