class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            int achiever = numbers[left]  + numbers[right];
            if(achiever == target){
                return new int[]{left+1,right+1};

            }else if(achiever < target ){
                left++;
            }else{
                right--;
            }  
            }
            return new int[]{};
        }

    }
