class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int first = n;

   
///           for lower bound
        while(start <= end){
            int mid = start + (end - start)/2;
            if( arr[mid] >= target){
                first = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;

            }
             
        }// if target doesn't exist ;
        if( first==n || arr[first] != target ){
            return new int []{-1,-1};
        }
        
        
        
        
        // for upper bound -1
         start = 0;
         end = n-1;

        int upper = n;// the position just after the array"in case target not present 
         while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] > target){
                upper = mid;
                 end = mid -1;

            }
              else{
                start = mid + 1;
              }
               
         }
         int last = upper -1;
          return new int []{first,last};
    }
}