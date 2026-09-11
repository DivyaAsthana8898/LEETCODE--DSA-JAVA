class Solution {
    public char findTheDifference(String s, String t) {
        int index = 0;
    HashMap<Character , Integer> map = new HashMap<>();

    for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
     while(index < t.length()){

        if(map.containsKey(t.charAt(index)) && map.get(t.charAt(index)) > 0){
            map.put(t.charAt(index),map.get(t.charAt(index))-1); // decrementing the frequency to avoid duplicacy issue;
            index++;
        }else{
            return t.charAt(index);
        }

     }
        return ' ';
    }
}