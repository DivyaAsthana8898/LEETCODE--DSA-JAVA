class Solution {
    public int minimumSum(int num) {
        int [] digit = new int[4];
        for(int i = 0;i<4;i++){
            digit[i] = num % 10;// provides last digit 
            num = num / 10;// removes the last digit


        }
         Arrays.sort(digit);
         int num1 = digit[0] * 10 + digit[2];
         int num2 = digit[1] * 10  + digit[3];
         return num1 + num2;
    }
}