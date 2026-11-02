class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'b'){
                 st.push(ch);
            }
            else{
               if(st.size() < 2){
                return false;
               } 

               if(st.peek() != 'b'){
                return false;
               }
                st.pop();
               
               if(st.peek() != 'a'){
                return false;
               }
                st.pop();
               }
            }
            if(st.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
    }
