class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                ans = mid;// just store the index if the condition is specified;
                       end = mid - 1;

            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}