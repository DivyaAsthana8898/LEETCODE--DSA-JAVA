class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
/// limit of capacity must not breach
// likewise the days must also be <= days
        for(int weight : weights){
            start = Math.max(start,weight);// maximum possible package weight
            end = end + weight;// maximum possible capacity ;

        }
             // Binary Search
         while(start< end ){
            int mid = start + (end - start)/2;
             int day = 1;
             int currentWeight = 0;
             for(int weight : weights){
            if(currentWeight + weight > mid){
                day++;
                currentWeight=0;
            }
            currentWeight += weight;
             }
               // 2<=5 jyada le ja rhe ho aur kam ja skta h load
              if(day <= days){
                end = mid;
              }
              // bhut kam le ja rhe ho capacity ship ki bdhyo 6<=5 false condition
              else{
                start = mid + 1;
              }
             
         }
         return end;
         
    }
}