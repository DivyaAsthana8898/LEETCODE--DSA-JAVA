// class Solution {
//     public int mySqrt(int x) {
//         int start = 1;
//         int end = x;
//         int ans = -1;
//         if(x == 0){
//             return 0;

//         }
//          while(start <= end){
//             int mid = start + (end - start)/2;
//             if(mid == x/mid ){// if target == mid 
//                 return mid;
//             }
//              else if(mid > x/mid){
//                 end = mid-1;
//              }else{
//                  ans = mid;
//                 start = mid + 1;
//              }
//          }
//          return ans;
//     }
// }

class Solution {
    public int mySqrt(int x) {

        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}