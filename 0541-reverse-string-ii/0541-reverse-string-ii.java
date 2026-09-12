class Solution {
    public String reverseStr(String s, int k) {
        char []word = s.toCharArray();
        for(int start = 0;start<word.length;start += 2*k){//start += 2*k;

  // next 2k block par jump

            int left = start;
            int right = Math.min(start+k-1,word.length-1);//first k characters ka last index,

            while(left < right){
                char  temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            }

        }
        return new String(word);
    }
}