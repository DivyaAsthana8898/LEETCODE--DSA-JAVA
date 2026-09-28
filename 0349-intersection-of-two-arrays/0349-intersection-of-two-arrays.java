class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int [Math.min(nums1.length,nums2.length)];
        int index = 0;
        for(int i =0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    //check if already added in temp or not
                    boolean alreadyAdded= false;
                    for(int k = 0;k<index;k++){
                        if(temp[k]==nums1[i]){
                        alreadyAdded = true;
                        break;
                    }
                }
                     
                     if(!alreadyAdded){
                        temp[index] = nums1[i];
                        index++;
                     }
                     break;
                }
            }
        }
        int[]result=new int[index];
        for(int i= 0;i<index;i++){
            result[i] = temp[i];//i is the current element being checked from nums1.
        }
         return result;
    }
}

         