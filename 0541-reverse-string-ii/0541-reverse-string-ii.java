class Solution {
    public String reverseStr(String s, int k) {
        char []word = s.toCharArray();
        for(int start = 0;start<word.length;start += 2*k){//jump

            int left = start;
            int right = Math.min(start+k-1,word.length-1);// right pos

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