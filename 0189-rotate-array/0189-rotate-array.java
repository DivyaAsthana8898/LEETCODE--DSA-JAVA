// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//          k = k%n;//ensures that if k is larger than the array size, we only rotate the necessary number of times to avoid wasting steps.

//         int[] temp=new int[n];// creating a temp array
//         for(int i =0;i<k;i++){// copying upto k indices elements in array
//             temp[i] = nums[n-k+i];// copy only k ele used nums[n-k+i]
//         }
//          for(int i =0;i<n-k;i++){// #copying element after k indices
//             temp[k+i] = nums[i]; 
//          }
//           for(int i=0;i<n;i++){// copying the whole array stored in temp to original nums[i]
//             nums[i] = temp[i];

//           }
   
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // 1. Reverse complete array
        reverse(nums, 0, n - 1);

        // 2. Reverse first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}