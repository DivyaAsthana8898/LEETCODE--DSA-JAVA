class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}

// ----------------------USING INSERTION SORT ------------------------
// class Solution {
//     public int[] sortArray(int[] arr) {
//          int n = arr.length;
//          for(int i = 1;i<=n-1;i++){
//             int current = i;
//             int prev = i-1;
//             int currentValue = arr[i];
//             // setting up the condition
//             while(prev >= 0 &&  currentValue <= arr[prev]){
//                 // shift
//                 arr[prev+1 ] = arr[prev];// prev is backwardpt put bakpt into frwrd pt.
//                 prev--;
//             }
//              // place put cuurentValue forward pt prev + 1 forward pt 
//                       arr[prev+1] = currentValue;
//          }
//           return arr;
//     }
// }