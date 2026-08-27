class Solution {
    public void reverseString(char[] s) {
        // setting up pointers 

        int left = 0;// pointer at starting 
        int right = s.length-1;// pointer at last 
          // reversing using temp variable;
        while(left < right ){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}