class Solution {
    public String reverseWords(String s) {
    
        String []words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String ch : words){
              StringBuilder word = new StringBuilder(ch);
            int  left = 0;
            int right = word.length()-1;
              

            while(left < right){
              char temp = word.charAt(left);
              word.setCharAt(left,word.charAt(right));
              word.setCharAt(right,temp);
              left++;
              right--;
            }
              ans.append(word).append(" ");
        }
                return ans.toString().trim();
    }
    }
    
