class Solution {
    public String removeDuplicates(String s) {
     Deque<Character> st = new ArrayDeque<>();
     

        for(char ch :s.toCharArray()){
        if(!st.isEmpty()  && ch == st.peek()){
             st.pop();
        } else{
            st.push(ch);
        } 
         }
      StringBuilder str = new StringBuilder();
      while(!st.isEmpty()){
        str.append(st.peek());
        st.pop();
      }
      return str.reverse().toString();
         }

    }
//         StringBuilder ans = new StringBuilder();// creating box ;it is acting like stack

//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);

//             if(ans.length() > 0 && ans.charAt(ans.length()-1)==ch){
//                 ans.deleteCharAt(ans.length()-1);
//             }else{
//                 ans.append(ch);
//             }
//         }
//         return ans.toString();
//     }
// }