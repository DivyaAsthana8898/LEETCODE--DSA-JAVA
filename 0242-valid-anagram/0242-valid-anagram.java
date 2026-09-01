class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
                       // generating map key => value
            }
        
        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);// freq downing
        }
        return true;
    }
}