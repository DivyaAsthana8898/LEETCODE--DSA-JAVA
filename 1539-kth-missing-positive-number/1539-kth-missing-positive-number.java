class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
      
        while(start <= end){
                 int mid = start +(end - start )/2;
            int missing = arr[mid] - (mid+1);// actual logic.  provides the count of missing no

        if(missing < k){
            start = mid + 1;

        }else{
            end = mid - 1;

        }
        }
         return start + k;


        }
    }
 