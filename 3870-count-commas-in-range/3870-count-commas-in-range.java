class Solution {
    public int countCommas(int n) {
     int count = 0;
        if( n < 1000){
            return 0;

        }  
                if(n >= 1000 && n <= 100000){
                    //int m = n % 10;
              // count = count+1+m;
              count = n - 1000 + 1;

                }
                
             return count;
        
        }
    }
 







    //            int k = 1000;
    //             while(k <= n){
    //             if(n >= 1000 && n < 10000){
    //                 //int m = n % 10;
    //           // count = count+1+m;
    //           count++;
    //           k++;

    //             }
    //             }
    //          return count;
        
    //     }
    // }
