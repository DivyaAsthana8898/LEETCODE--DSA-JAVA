class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(String word : words){
            boolean valid = true;
            // traversing over the string
            for(int i = 0; i < word.length();i++){
                char ch = word.charAt(i);

                if(!allowed.contains(String.valueOf(ch))){
                    valid = false;
                    break;
                }
            }
                if(valid){
                    count++;
                }
            } 
        
        
        return count;
    }
}