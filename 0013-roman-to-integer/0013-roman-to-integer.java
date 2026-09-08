class Solution {
    public int romanToInt(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int ans = 0;
            // for traversing over the string

            for(int i =0;i<s.length();i++){
                int current = map.get(s.charAt(i));
                if(i+1 < s.length() && current < map.get(s.charAt(i+1))){
                    ans = ans - current;
                }else{
                    ans = ans + current;
                }
                   
                }
                  return ans;
            }
          
    }
