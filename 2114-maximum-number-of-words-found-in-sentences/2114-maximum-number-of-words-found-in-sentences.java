class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            max = Math.max(max,words.length);

        }
        return max;
    }
}