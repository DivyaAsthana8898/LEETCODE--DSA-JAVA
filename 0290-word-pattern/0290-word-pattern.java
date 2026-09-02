class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
         String[] str1 = s.split(" ");
           if(pattern.length() != str1.length) {
                      return false;
                    }// check Kyuki pattern ke characters aur s ke words ki count same honi chahiye
        for(int i = 0;i<pattern.length();i++){
                  char ch = pattern.charAt(i);
                  String str = str1[i];
        if(map.containsKey(ch) && !map.get(ch).equals(str)){
         return false;
        }
          if(map2.containsKey(str) && map2.get(str) !=ch){
         return false;
        }
       
        map.put(ch,str);
        map2.put(str,ch);
        }

        return true;


    }

}