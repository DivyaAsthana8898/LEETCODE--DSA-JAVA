class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

            }
             int ans = 0;
             boolean odd = false ;
             for(int freq : map.values()){
                if(freq % 2 == 0){ // 2 % 2 = 0
                    ans = ans + freq; // 0 + 2 = 2
                }else{
                    ans = ans + freq - 1;// ODD CASE  0 + 1 - 1 = 0
                     odd = true;
                }
             }
             if(odd){
                ans++;// CENTER ELEMENT COUNT ADDED WHICH IS 1 ;
             }
              return ans;
        }
       
    }
