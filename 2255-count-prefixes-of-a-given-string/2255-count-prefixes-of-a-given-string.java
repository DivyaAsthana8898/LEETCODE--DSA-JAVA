class Solution {
    public int countPrefixes(String[] words, String s) {
        
          int count = 0;
        for(String num : words){
            if(s.startsWith(num)){
            count++;
            }
        }
        return count;
    }
}