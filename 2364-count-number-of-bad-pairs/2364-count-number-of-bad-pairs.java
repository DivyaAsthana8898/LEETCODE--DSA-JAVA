class Solution {
    public long countBadPairs(int[] nums) {

        int n = nums.length;
        long count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int val = i - nums[i];

            int good = map.getOrDefault(val, 0);

            count += i - good;

            map.put(val, good + 1);
        }

        return count;
    }
}


// -------------------------- BRUTE FORCE -----------------------

// class Solution {
//     public long countBadPairs(int[] nums) {
//         int n = nums.length;
//         long count = 0;
         
//          for(int i = 0;i<n;i++){
//             for(int j = i+1; j < n;j++ ){
//                int val = j - i;

//                int c = nums[j] - nums[i];
//                if( val != c){
//                 count++;
//                }
//             }
//          }
//          return count ;
//     }
// }
