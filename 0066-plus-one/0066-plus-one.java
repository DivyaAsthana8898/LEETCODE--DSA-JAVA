class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;// if last digit is 9 make it 0;
            }
            int []result = new int[digits.length+1];
            result[0] = 1;// place 1 at the very first position
            return result;
        }
    }
