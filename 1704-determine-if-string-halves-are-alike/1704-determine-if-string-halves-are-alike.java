class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        int a = 0;
        int b = n;

        
          int count  = 0;
          int count1 = 0;

        while( a <  n){
               char ch  = s.charAt(a);
                   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                   count++;
            }
                a++;
        }
    
            while( b < s.length()){
               char ch  = s.charAt(b);
                   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                   count1++;
            }
                b++;
            }
    
             return count == count1;

        }


    }
