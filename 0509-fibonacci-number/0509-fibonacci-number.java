class Solution {
    public int fib(int n) {
        // setting up base condition for zero;
        if(n == 0){

        return 0;
      }
    
      // setting up base condition for one;
       if(n==1){
       return 1;
    } 
    
       // recursive relation;
     int ans = fib(n-1) + fib(n-2);
     return ans;
}
}