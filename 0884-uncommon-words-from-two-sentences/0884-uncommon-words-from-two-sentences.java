class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String []word1 = s1.split(" ");
        String []word2 = s2.split(" ");

        HashMap<String , Integer> map = new HashMap<>();

        for(String words : word1){
          map.put(words,map.getOrDefault(words,0)+1);

        }
            for(String words : word2){
          map.put(words,map.getOrDefault(words,0)+1);

        }
         ArrayList<String> ans = new ArrayList<>();

         for(String word : map.keySet()){
            if(map.get(word) == 1){
                ans.add(word);
            }
         }
         return  ans.toArray(new String[0]);
    }
}