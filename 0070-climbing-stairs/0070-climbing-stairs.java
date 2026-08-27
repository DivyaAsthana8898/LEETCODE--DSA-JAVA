class Solution {
    public int climbStairs(int n) {
        
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int prev1 = 1; // ways for n = 1
        int prev2 = 2; // ways for n = 2

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;

            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }
}




// class Solution {


//     public int climbStairs(int n) {
//         // handling base cases 

//         // handling base case 1
//          if(n==1){
//             return 1;
//          }
//          // handling base case 2
//          if(n==2){
//             return 2;
//          }
//          int answer = climbStairs(n-1) + climbStairs(n-2);
//          return answer;
         
//     }

// }