class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        // adding key and value in hashmap;

        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) +1);
        }// till here we have builted key : value pair  'l':1

          for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
                if(map.get(ch) == 1){
                    return i;
                }   
            }
          
          return -1;  
    }
}