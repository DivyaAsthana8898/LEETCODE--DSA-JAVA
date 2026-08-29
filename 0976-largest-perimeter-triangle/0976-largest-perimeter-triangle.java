class Solution {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {

            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}

// Brute Force /////////////

// class Solution {
//     public int largestPerimeter(int[] nums) {
//         int n = nums.length;
//         int maxi = 0;
//                 for(int i = 0;i<n;i++){
//                 for(int j=i+1;j<n;j++){
//                 for(int k = j+1;k<n;k++){
//                 int  side1 = nums[i];
//                 int  side2= nums[j];
//                 int  side3 = nums[k];
//                 if (side1 + side2 > side3 && side1 + side3 > side2 &&
//                 side2 + side3 > side1){
//                     int result = side1 + side2 + side3;
//                        maxi = Math.max(maxi,result);
//                 }
//              }
//           }
//       }
//       return maxi;
        

//     }
// }