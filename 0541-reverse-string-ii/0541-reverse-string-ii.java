class Solution {
    public String reverseStr(String s, int k) {
        char []words = s.toCharArray();
        for(int start = 0;start < words.length;start +=  2*k){// jump for start

            // 
            int left = start;
            int right = Math.min(start+k-1,words.length-1); // //first k characters ka last index,

            // Using temp to perform swapping
            while(left < right){
                char  temp = words[left];
                words[left] = words[right];
                words[right] = temp;  
                left++;
                right--;
            }
        }
        return new String(words);
    }
}