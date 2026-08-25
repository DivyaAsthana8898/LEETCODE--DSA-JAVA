class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
              while(i>=0){
                // handling trailing spaces cases
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }// if i < 0 case
           if(i<0){
            break;
           }

           // handling if char found case
        int j = i;
        while(j>=0 && s.charAt(j)  != ' '){
            j--;
        }// appending into stringbuilder
        ans.append(s.substring(j+1,i+1));

                 // handling space case 
            while(j>=0  && s.charAt(j) ==' ' ){
                j--;
            }// appendng those space
            if(j>=0){
                ans.append(' ');
            }
            // bringing the i onto the j spot
            i=j;

            
              }
            
        return ans.toString();
        }
    }
