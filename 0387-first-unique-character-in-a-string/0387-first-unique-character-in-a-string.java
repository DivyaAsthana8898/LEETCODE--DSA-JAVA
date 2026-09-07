class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
       
        for( char ch : s.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
         // traversing over the string
         for(int j = 0;j< s.length();j++){
            char ch = s.charAt(j);
            if(map.get(ch) == 1){
                return j;
            }
            }
            return -1;
         }
    }
