class Solution {
    public void reverseString(char[] s) {
        // setting pointers
        int left = 0;
        int right = s.length-1;
        while(left < right){
            // reversing using temp variable;
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}