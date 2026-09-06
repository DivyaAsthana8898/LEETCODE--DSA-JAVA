class Solution {
    public String truncateSentence(String s, int k) {
        //String s = "KNOWLEDGE IS THE POWER OF THIS CENTURY"
        int i = 0;
        String ans = "" ;
        String[] words = s.split(" ");
         while( i < k){
          
             ans = ans + words[i] + " " ;
            // ans = ans.trim();
             i++;
          
         }
         return ans.trim();
    }
}