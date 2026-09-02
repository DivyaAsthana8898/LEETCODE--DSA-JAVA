 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;// p1 is the pointer at arraynums
        int p2 = n-1;// p2 is the pointer at arraynums
        int i = m+n-1;// is the  pointer at merged array last index
        while(p2>=0){// it will run unitil the index becomes 0;
        if( p1>=0 && nums1[p1]>nums2[p2]){// check p1 ptr >=0 and if nums1[p1] > nums2[p2]
            nums1[i--] = nums1[p1--];// move both the ptr backward
        }
         else{
            nums1[i--] = nums2[p2--];// if nums1[p1] < nums2[p2] move then these ptrs main merged array back
             // + num2[p2] back
         }
    }
 }
}