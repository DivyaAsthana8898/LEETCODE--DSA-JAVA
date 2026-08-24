class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
           while(start<= end ){

        int mid = start + (end - start)/2;
        int prevValue = -1;
        int current = nums[mid];// value
        if(mid - 1 >= 0){
            prevValue =nums[mid -1];
        }
         int nextValue = -1;
         if(mid + 1 < n ){
            nextValue = nums[mid + 1];

         }
         if(start == end){
            return nums[start];

         }
          if(current != prevValue  && current != nextValue){
             return current;

          }
           if(current != prevValue && current == nextValue){
         int   startingElementIndex = mid;// mid providing the index
            if((startingElementIndex & 1) == 1){
                end = mid -1;
            }else{
                start = mid + 1;
            }
           }
              if(current == prevValue && current != nextValue){
         int    endingElementIndex = mid;
            if((endingElementIndex & 1) == 1){
               
                   start = mid + 1;
            }else{
                 end = mid -1;
            }

           }
       
          
    }
    return -1;
    
    }
}